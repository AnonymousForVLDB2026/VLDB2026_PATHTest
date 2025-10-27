package org.example.PATHTest.cypher.oracle;

import org.example.PATHTest.CypherTransform.CypherVisitorImp;
import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.common.oracle.TestOracle;
import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.cypher.CypherQueryAdapter;
import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.dsl.IQueryGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.exceptions.ResultMismatchException;
import org.opencypher.gremlin.translation.TranslationFacade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class DifferentialNonEmptyBranchOracle <G extends CypherGlobalState<?,S>, S extends CypherSchema<G,?>> implements TestOracle {

    private final G globalState;
    private IQueryGenerator<S, G> queryGenerator;
    private CypherVisitorImp cypherVisitor;
    private FileWriter fw;
    private static boolean needLabel = false;
    static int num = 0;


    public static final int BRANCH_PAIR_SIZE = 65536;
    public static final  int BRANCH_SIZE = 1000000;
    public static boolean result_changed = false;

    public static final int PORT = 9009;
    public static final byte CLEAR = 1, PRINT_MEM = 2;


    public DifferentialNonEmptyBranchOracle(G globalState, IQueryGenerator<S,G> generator) throws IOException {
        this.globalState = globalState;
        //todo 整个oracle的check会被执行多次，一直是同一个oracle实例，因此oracle本身可以管理种子库
        this.queryGenerator = generator;
        this.cypherVisitor = new CypherVisitorImp();
        cypherVisitor.setGlobalState(globalState);
        String log_file_name = "log_" + globalState.getOptions().getDatabaseType() + ".txt";
        this.fw = new FileWriter(log_file_name, true);
        if (globalState.getDatabaseName().contains("nebula")){
            needLabel = true;
        }
    }

    public static boolean needLabel() {
        return needLabel;
    }

    public void check_message(String message, String sb, String another_sb) throws Exception {
        if (message != null) {
            
            if(message.contains("There are no variables in scope to use for '*'")||message.contains("Unbound variable:")||message.contains("Could not create a valid query plan, possible ill-formed query")||message.contains("is shadowing a variable with the same name from the outer scope and needs to be renamed")||(message.contains("argument at position")&&message.contains("must be")))
                System.out.println();
            else if (message.contains("ERROR:  function array_length(edge[]) does not exist")|| message.contains("duplicate variable")|| message.contains("label on variable from previous clauses is not allowed")) {
                
            } else if (message.contains("Error found in optimization stage: IndexNotFound: No valid index found")) {
                
            } else {
                String s=null;
                String s_another=null;
                try{
                    if(globalState.getDatabaseName().contains("janus")){
                        s= (new TranslationFacade()).toGremlinGroovy(sb);
                        s_another=(new TranslationFacade()).toGremlinGroovy(another_sb);
                    }
                    else{
                        s=sb;
                        s_another=another_sb;
                    }
                }
                catch (Exception e){
                    if(e.getMessage().contains("Unsupported clause")||e.getMessage().contains("Unknown function")||e.getMessage().contains("Invalid input")||e.getMessage().contains("cannot follow"))
                        System.out.println();
                    else {
                        e.printStackTrace();
                        System.out.println(e.getMessage() + "\n");
                    }
                }
                if(s!=null&&s_another!=null)
                {
                    num++;
                    fw.write(num + ". EXCEPTIONS in:" + globalState.getDatabaseName() + "\n" + message + "\n");
                    fw.write(sb + "\n" + s + "\n" + another_sb + "\n" + s_another + "\n***********************\n");
                }

            }
        } else {
            num++;
            fw.write(num+"、 EXCEPTIONS of null message in:" + globalState.getDatabaseName() + "\n");
            fw.write(sb + "\n" + another_sb + "\n++++++++++++++++++++++++++\n");
        }
        fw.flush();
    }


    @Override
    public void check() throws Exception {
        //todo oracle 的检测逻辑，会被调用多次
        IClauseSequence sequence = queryGenerator.generateQuery(globalState);
        StringBuilder sb = new StringBuilder();
        sequence.toTextRepresentation(sb);
        System.out.println(sb);

        List<Exception> exception_in_database01 = new ArrayList<>();
        List<Exception> exception_in_database02 = new ArrayList<>();
        //if (Randomly.getBoolean()){
            cypherVisitor.setIsUnionPartition(true);
        //}

        String mutatorSb = CypherVisitorImp.transform(cypherVisitor, sb.toString());
        cypherVisitor.Clear();

        List<GDSmithResultSet> results = new ArrayList<>();
        int resultLength = 0;
        byte[] branchCoverage = new byte[BRANCH_SIZE];
        byte[] branchPairCoverage = new byte[BRANCH_PAIR_SIZE];
        System.out.println(sb);
        System.out.println(mutatorSb);
        //todo 标识数据库状态一致性，false表示当前数据库不再可用，需要抛出异常
        boolean database_state_same = true;


        try {
            //记录第一个数据库查询返回结果
            results.addAll(globalState.executeStatementAndGet(new CypherQueryAdapter(sb.toString())));
        } catch (Exception e) {
            exception_in_database01.add(e);
        }
        try {
            //记录第一个数据库查询返回结果
            results.addAll(globalState.executeStatementAndGet(new CypherQueryAdapter(mutatorSb.toString())));
        } catch (Exception e) {
            exception_in_database02.add(e);
        }

        //todo 蜕变前后两个查询语句有相同的报错信息
        if (exception_in_database01.size() == 1 && exception_in_database02.size() == 1 && exception_in_database01.get(0).getMessage().equals(exception_in_database02.get(0).getMessage())) {
            check_message(exception_in_database01.get(0).getMessage(), sb.toString(), mutatorSb);
        }
        //todo 蜕变前后两个查询语句都无报错信息
        else if (exception_in_database01.size() == 0 && exception_in_database02.size() == 0) {
            System.out.println("both queries success!");
        }
        //todo 只有一个数据库执行成功或者蜕变前后的报错信息不一样
        else {
            if (exception_in_database01.size() != 0) {
                check_message(exception_in_database01.get(0).getMessage(), sb.toString(), mutatorSb);
            } else if (exception_in_database02.size() != 0) {
                check_message(exception_in_database02.get(0).getMessage(), sb.toString(), mutatorSb);
            }
            if (exception_in_database01.size() + exception_in_database02.size() == 1)
            {
                System.out.println("database_state_exeception \n\n\n\n*****************");
                database_state_same=false;
            }
        }
        if (!database_state_same) {
            throw new ResultMismatchException("mismatch database state!");
        }
        if(globalState.getOptions().getCoverage_port() != 0) {
            try (Socket clientSocket = new Socket("127.0.0.1", globalState.getOptions().getCoverage_port())){
                OutputStream os = clientSocket.getOutputStream();
                InputStream is = clientSocket.getInputStream();
                os.write(PRINT_MEM);
                os.flush();

                byte[] allBytes = is.readAllBytes();
                for(int j = 0; j < BRANCH_PAIR_SIZE; j++){
                    branchPairCoverage[j] = allBytes[j];
                }

                int coveredBranch = 0;
                for(int j = 0; j < BRANCH_SIZE; j++){
                    branchCoverage[j] = allBytes[j+BRANCH_PAIR_SIZE];
                    if(allBytes[j+BRANCH_PAIR_SIZE] != 0){
                        coveredBranch++;
                    }
                }
                System.out.println(""+coveredBranch+"\n");
                clientSocket.shutdownInput();
                clientSocket.shutdownOutput();
            }
        }

        for (int i=1; i < results.size(); i++){
            if (!results.get(i).compareWithOutOrder(results.get(i - 1))) {
                //todo 过滤掉一些导致误报的情况（如RETURN *，RETURN DISTINCT *）
                if (sb.toString().contains("RETURN *") || sb.toString().contains("RETURN DISTINCT *") || sb.toString().contains("SKIP 1") || sb.toString().contains("LIMIT 1")) {
                } else {
                    check_message("mismatch in results",sb.toString(),mutatorSb);
                }
            }
        }

        if (results.size() == 2) {
            resultLength = results.get(0).getRowNum();
        }





        boolean isBugDetected = false;
        //todo 上层通过抛出的异常检测是否通过，所以这里可以捕获并检测异常的类型，可以计算一些统计数据，然后重抛异常

        List<CypherSchema.CypherLabelInfo> labels = globalState.getSchema().getLabels();
        List<CypherSchema.CypherRelationTypeInfo> relations = globalState.getSchema().getRelationTypes();

        queryGenerator.addNewRecord(sequence, isBugDetected, resultLength, branchCoverage, branchPairCoverage);
    }

    @Override public FileWriter getFw(){return fw;}

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("log1.txt", true);
        fw.write("This is a test\n");
        System.out.println("This is a test\n");
        fw.flush();fw.flush();
        fw.write("test2\n");
        System.out.println("test2\n");
        fw.close();
    }
}
