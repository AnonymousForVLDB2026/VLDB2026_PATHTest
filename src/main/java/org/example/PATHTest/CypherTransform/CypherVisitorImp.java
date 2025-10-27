package org.example.PATHTest.CypherTransform;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.parsercypher.gen.CypherLexer;
import org.example.PATHTest.parsercypher.CypherParser;
import org.example.PATHTest.parsercypher.CypherParserBaseVisitor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.PATHTest.parserutil.parserUtils.getFullTextOriginal;

public class CypherVisitorImp<G extends CypherGlobalState<?, S>, S extends CypherSchema<G, ?>> extends CypherParserBaseVisitor<String> {
    protected String result_qurey;
    protected ArrayList<String> resultQueryUnionPartition;
    protected ArrayList<String> unionPartitionPattern;
    protected int unionPartitionIndex;
    protected boolean isUnionPartition;
    protected boolean inUnionPartition;
    protected boolean isDistinctReturn;
    private G globalState;
    private List<String> with_operator = Arrays.asList("WITH * ");
    private List<String> where_operator = Arrays.asList("WHERE TRUE ");
    private List<String> order_operator = Arrays.asList("ORDER BY TRUE ", "ORDER BY FALSE ", "ORDER BY NULL ", "ORDER BY 1 ");
    private List<String> order_operator_add = Arrays.asList(",TRUE ", ",FALSE ", ",NULL ", ",1 ");
    private List<String> return_operator = Arrays.asList("RETURN * ", "RETURN NULL ");
    private List<String> desc_operator = Arrays.asList("DESC ");
    private List<String> call_return_operator = Arrays.asList("NULL AS aa");

    
    public CypherVisitorImp() {
        this.result_qurey = "";
        this.resultQueryUnionPartition = new ArrayList<>();
        this.unionPartitionPattern = new ArrayList<>();
        this.unionPartitionIndex = 0;
        this.isUnionPartition = false;
        this.inUnionPartition = false;
        this.isDistinctReturn = false;
        this.r = new Randomly();
        this.ID = 0;
        this.create_id = 0;
        this.unwind_id = 0;
        this.path_id = 0;
        this.call_return_id = 0;
        this.avaliableIdentifiers=new ArrayList<>();
        this.avaliableLocalIdentifiers = new ArrayList<>();
        this.varLengthPartition = false;
        this.optionalMatch = false;
    }

    public void setGlobalState(G g) {
        this.globalState = g;
    }
    public void setIsUnionPartition(boolean isUnionPartition) {
        this.isUnionPartition = isUnionPartition;
    }
    public int ID = 0;
    public boolean in_where = false;
    public int create_id = 0;
    public int unwind_id = 0;
    public int path_id = 0;
    public int call_return_id = 0;
    public Randomly r;
    public ArrayList<String> avaliableIdentifiers;
    public ArrayList<String> avaliableLocalIdentifiers;
    public boolean varLengthPartition;
    public boolean optionalMatch;
    public static Boolean in_subquery = false;


    public String Getresult_qurey() {
        if (!unionPartitionPattern.isEmpty()){
            int replaceLength = unionPartitionPattern.get(0).length();
            StringBuilder replaced_result = new StringBuilder();
            StringBuilder unionAllPartitionResult = new StringBuilder();
            unionAllPartitionResult.append(result_qurey);
            if (isDistinctReturn){
                unionAllPartitionResult.append(" UNION ");
            }else {
                unionAllPartitionResult.append(" UNION ALL ");
            }
            for (int i = 1; i < unionPartitionPattern.size(); i++){
                replaced_result.append(result_qurey.substring(0, unionPartitionIndex));
                replaced_result.append(unionPartitionPattern.get(i));
                replaced_result.append(result_qurey.substring(unionPartitionIndex+replaceLength, result_qurey.length()));
                unionAllPartitionResult.append(replaced_result);
                if (i != unionPartitionPattern.size()-1){
                    if (isDistinctReturn){
                        unionAllPartitionResult.append(" UNION ");
                    }else {
                        unionAllPartitionResult.append(" UNION ALL ");
                    }                }
                replaced_result = new StringBuilder();
            }
            return unionAllPartitionResult.toString();
        }
        return this.result_qurey;
    }

    public void Clear() {
        this.result_qurey = "";
        this.resultQueryUnionPartition.clear();
        this.unionPartitionPattern.clear();
        this.unionPartitionIndex = 0;
        this.isUnionPartition = false;
        this.inUnionPartition = false;
        this.isDistinctReturn = false;
        this.ID = 0;
        this.create_id = 0;
        this.unwind_id = 0;
        this.path_id = 0;
        this.in_where = false;
        this.avaliableIdentifiers.clear();
        this.avaliableLocalIdentifiers.clear();
    }

    private ArrayList<String> updateIdentifiers(ParserRuleContext ctx) {
        if (ctx instanceof CypherParser.PatternWhereContext){
            for (int i = 0; i < ((CypherParser.PatternWhereContext)ctx).pattern().patternPart().size(); i++){
                CypherParser.PatternPartContext patternPart = ((CypherParser.PatternWhereContext)ctx).pattern().patternPart(i);
                CypherParser.NodePatternContext nodePatternContext = patternPart.patternElem().nodePattern();
                List<CypherParser.PatternElemChainContext> patternElemChainContextList = patternPart.patternElem().patternElemChain();
                if (nodePatternContext.symbol() != null){
                    if (!avaliableIdentifiers.contains(nodePatternContext.symbol().getText())){
                        avaliableIdentifiers.add(nodePatternContext.symbol().getText());
                        avaliableLocalIdentifiers.add(nodePatternContext.symbol().getText());
                    }
                }
                if (!patternElemChainContextList.isEmpty()){
                    for (CypherParser.PatternElemChainContext chainContext : patternElemChainContextList){
                        if (chainContext.nodePattern().symbol() != null){
                            if (!avaliableIdentifiers.contains(chainContext.nodePattern().symbol().getText())){
                                avaliableIdentifiers.add(chainContext.nodePattern().symbol().getText());
                                avaliableLocalIdentifiers.add(chainContext.nodePattern().symbol().getText());
                            }
                        }
                        if (chainContext.relationshipPattern().relationDetail().symbol() != null){
                            if (!avaliableIdentifiers.contains(chainContext.relationshipPattern().relationDetail().symbol().getText())){
                                avaliableIdentifiers.add(chainContext.relationshipPattern().relationDetail().symbol().getText());
                                avaliableLocalIdentifiers.add(chainContext.relationshipPattern().relationDetail().symbol().getText());
                            }
                        }
                    }
                }
            }
            return null;
        }else if (ctx instanceof CypherParser.UnwindStContext){
            if (((CypherParser.UnwindStContext)ctx).symbol() != null) {
                if (!avaliableIdentifiers.contains(((CypherParser.UnwindStContext)ctx).symbol().getText())) {
                    avaliableIdentifiers.add(((CypherParser.UnwindStContext)ctx).symbol().getText());
                }
            }
        }else if (ctx instanceof CypherParser.WithStContext){
            if (((CypherParser.WithStContext)ctx).projectionBody().projectionItems().MULT()==null) {
                avaliableIdentifiers.clear();
            }
            for(CypherParser.ProjectionItemContext projectionItem: ((CypherParser.WithStContext)ctx).projectionBody().projectionItems().projectionItem()){
                if(projectionItem.AS()!=null) {
                    if (!avaliableIdentifiers.contains(projectionItem.AS().getText())) {
                        avaliableIdentifiers.add(projectionItem.symbol().getText());
                    }
                }else {
                    String symbol = projectionItem.expression().xorExpression(0).andExpression(0).notExpression(0).comparisonExpression().addSubExpression(0).multDivExpression(0).powerExpression(0).unaryAddSubExpression(0).atomicExpression().propertyOrLabelExpression().propertyExpression().atom().symbol().getText();
                    if(!avaliableIdentifiers.contains(symbol)){
                        avaliableIdentifiers.add(symbol);
                    }
                }
            }
        }else if (ctx instanceof CypherParser.ScriptContext){
            avaliableIdentifiers.clear();
        }

        return null;
    }

    private void avaliableLocalIdentifiersClear(){
        avaliableLocalIdentifiers.clear();
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        if (!node.getText().equals(";") && !node.getText().equals("<EOF>")){
            if (node.getParent() instanceof CypherParser.RelationshipPatternContext || node.getParent() instanceof CypherParser.RelationDetailContext){
                result_qurey += node.getText();
            }else if (node.getParent() instanceof CypherParser.NodePatternContext){
                result_qurey += node.getText();
            }else {
                result_qurey += node.getText() + " ";
            }
        }
        return null;
    }

    @Override
    public String visitPatternWhere(CypherParser.PatternWhereContext ctx) {

        //todo 对于非Redis数据库，只拆分最外层的matchstatement语句中的模式（忽略子查询中的match模式）
        if (ctx.parent.parent.parent instanceof CypherParser.SingleQueryContext && (r.getInteger(0,2)==0 || varLengthPartition) && !globalState.getDatabaseName().contains("redis")) {
            List<String> identifiers = new ArrayList<>();
            List<String> patterns = new ArrayList<>();
            List<String> single_node_patterns = new ArrayList<>();
            List<String> doubleNegationIdentifiers = new ArrayList<>();
            List<StringBuilder> varLengthPartitionIdentifierBuilders = new ArrayList<>();
            List<String> varLengthPartitionIdentifiers = new ArrayList<>();
            ArrayList<Integer> lowBound = new ArrayList<>();
            ArrayList<Integer> upperBound = new ArrayList<>();
            int boundIndex = 0, varLengthPatternIndex = 0;
            int random = r.getInteger(0, ctx.pattern().patternPart().size());
            
            int randomPathMutationStrategy = r.getInteger(2, 4);
            if (varLengthPartition){
                ArrayList<Integer> varLengthPattern  = new ArrayList<>();
                ArrayList<Integer> varLengthIndexes = new ArrayList<>();
                for (int i = 0; i < ctx.pattern().patternPart().size(); i++){
                    if (ctx.pattern().patternPart().get(i).patternElem().patternElemChain()!=null) {
                        List<CypherParser.PatternElemChainContext> patternElemChainContexts = ctx.pattern().patternPart().get(i).patternElem().patternElemChain();
                        for (int j = 0; j < patternElemChainContexts.size(); j++) {
                            CypherParser.PatternElemChainContext patternElemChainContext = patternElemChainContexts.get(j);
                            if (patternElemChainContext.relationshipPattern().relationDetail().rangeLit() == null){
                                continue;
                            }
                            List<CypherParser.NumLitContext> numLitContexts = patternElemChainContext.relationshipPattern().relationDetail().rangeLit().numLit();
                            if (numLitContexts.size() == 2 || (numLitContexts.size() == 1 && numLitContexts.get(0).parent.getChild(2) instanceof CypherParser.NumLitContext)) {
                                varLengthPattern.add(i);
                                varLengthIndexes.add(j);
                                if (numLitContexts.size() == 2){
                                    int tempLow = Integer.parseInt(numLitContexts.get(0).getText());
                                    lowBound.add(tempLow==0?1:tempLow);
                                    upperBound.add(Integer.parseInt(numLitContexts.get(1).getText()));
                                }else {
                                    lowBound.add(1);
                                    upperBound.add(Integer.parseInt(numLitContexts.get(0).getText()));
                                }
                                break;
                            }
                        }
                    }
                }
                if (!varLengthPattern.isEmpty()){
                    boundIndex = r.getInteger(0, varLengthPattern.size());
                    varLengthPatternIndex = varLengthIndexes.get(boundIndex);
                    random = varLengthPattern.get(boundIndex);
                    randomPathMutationStrategy = 4;
                    if (optionalMatch){
                        result_qurey = result_qurey.substring(0, result_qurey.length()-15);
                        result_qurey += "MATCH ";
                    }
                }else {
                    varLengthPartition = false;
                    if (!inUnionPartition) {
                        if (optionalMatch) {
                            result_qurey = result_qurey.substring(0, result_qurey.length() - 23);
                            result_qurey += "MATCH ";
                            optionalMatch = false;
                        } else {
                            result_qurey = globalState.getDatabaseName().contains("mem") ? result_qurey.substring(0, result_qurey.length() - 11) : result_qurey.substring(0, result_qurey.length() - 14);
                            result_qurey += " MATCH ";
                        }
                    }
                }
            }
            if (randomPathMutationStrategy >= 2 && randomPathMutationStrategy != 4){
                ArrayList<Integer> anonymousPattern  = new ArrayList<>();
                for (int i = 0; i < ctx.pattern().patternPart().size(); i++){
                    if (ctx.pattern().patternPart().get(i).patternElem().patternElemChain()!=null) {
                        List<CypherParser.PatternElemChainContext> patternElemChainContexts = ctx.pattern().patternPart().get(i).patternElem().patternElemChain();
                        for (CypherParser.PatternElemChainContext patternElemChainContext : patternElemChainContexts) {
                            if (patternElemChainContext.relationshipPattern().relationDetail().symbol() == null
                            && patternElemChainContext.relationshipPattern().relationDetail().rangeLit() == null) {
                                anonymousPattern.add(i);
                                break;
                            }
                        }
                    }
                }
                if (!anonymousPattern.isEmpty()){
                    random = anonymousPattern.get(r.getInteger(0, anonymousPattern.size()));
                }else {
                    randomPathMutationStrategy = 5;
                }
            }


            for (int i = 0; i < ctx.pattern().patternPart().size(); i++) {
                CypherParser.PatternPartContext p = ctx.pattern().patternPart().get(i);
                //todo 随机选择一个模式拆分
                if (i == random) {
                    if (p.ASSIGN() != null) {
                        identifiers.add(getFullTextOriginal(p));
                    } else {
                        CypherParser.PatternElemContext pe = p.patternElem();
                        while (pe.patternElem() != null)
                            pe = pe.patternElem();
                        //对于只有一个点的模式，只提取属性值
                        if (pe.patternElemChain().size() == 0) {
                            if (pe.nodePattern().properties() == null || pe.nodePattern().symbol() == null) {
                                identifiers.add(getFullTextOriginal(pe));
                            } else {
                                if (pe.nodePattern().nodeLabels() != null)
                                    identifiers.add("(" + pe.nodePattern().symbol().getText() + pe.nodePattern().nodeLabels().getText() + ")");
                                else
                                    identifiers.add("(" + pe.nodePattern().symbol().getText() + ")");
                                for (CypherParser.MapPairContext m : pe.nodePattern().properties().mapLit().mapPair()) {
                                    single_node_patterns.add(pe.nodePattern().symbol().getText() + "." + m.name().getText() + "=" + getFullTextOriginal(m.expression()));
                                }
                            }
                        }
                        //对于有边的模式
                        else {
                            
                            if (randomPathMutationStrategy < 1) {
                                String pattern = "";
                                CypherParser.NodePatternContext np = pe.nodePattern();
                                if (np.symbol() != null && np.nodeLabels() != null) {
                                    identifiers.add("(" + np.symbol().getText() + np.nodeLabels().getText() + ")");
                                } else if (np.symbol() != null) {
                                    identifiers.add("(" + np.symbol().getText() + ")");
                                } else if (np.nodeLabels() != null) {
                                    identifiers.add("(" + "nn" + this.ID + np.nodeLabels().getText() + ")");
                                    ID++;
                                } else {
                                    identifiers.add("(" + "nn" + this.ID + ")");
                                    ID++;
                                }
                                pattern += "(";
                                if (np.symbol() != null)
                                    pattern += np.symbol().getText();
                                else {
                                    ID--;
                                    pattern += "nn" + this.ID;
                                    ID++;
                                }
                                if (np.properties() != null)
                                    pattern += getFullTextOriginal(np.properties());
                                pattern += ")";
                                for (CypherParser.PatternElemChainContext pec : pe.patternElemChain()) {
                                    np = pec.nodePattern();
                                    CypherParser.RelationshipPatternContext rp = pec.relationshipPattern();
                                    String id = "";
                                    if (rp.relationDetail().symbol() != null) {
                                        id = rp.relationDetail().symbol().getText();
                                    } else {
                                        id = "m" + this.ID;
                                        this.ID++;
                                    }
                                    String lr_id = "";
                                    String rr_id = "";
                                    String lr_p = "";
                                    String rr_p = "";
                                    if (rp.LT() != null) {
                                        lr_id = "<-";
                                        lr_p = "<-";
                                        rr_id = "-";
                                        rr_p = "-";
                                    } else if (rp.GT() != null) {
                                        lr_id = "-";
                                        lr_p = "-";
                                        rr_id = "->";
                                        rr_p = "->";
                                    }
                                    //todo 模式拆分后的关系必须有方向
                                    else {
                                        lr_id = "<-";
                                        rr_id = "-";
                                        lr_p = "-";
                                        rr_p = "-";
                                    }
                                    String r = "()" + lr_id + "[" + id;
                                    if (rp.relationDetail().relationshipTypes() != null) {
                                        r += rp.relationDetail().relationshipTypes().getText();
                                    }
                                    if (rp.relationDetail().rangeLit() != null) {
                                        r += rp.relationDetail().rangeLit().getText();
                                    }
                                    if (rp.relationDetail().properties() != null) {
                                        r += getFullTextOriginal(rp.relationDetail().properties());
                                    }
                                    identifiers.add(r + "]" + rr_id + "()");
                                    if (rp.relationDetail().rangeLit() == null) {
                                        pattern += lr_p + "[" + id + "]" + rr_p;
                                    } else {
                                        pattern += lr_p + "[" + id + rp.relationDetail().rangeLit().getText() + "]" + rr_p;
                                    }
                                    if (np.symbol() != null && np.nodeLabels() != null) {
                                        identifiers.add("(" + np.symbol().getText() + np.nodeLabels().getText() + ")");
                                    } else if (np.symbol() != null) {
                                        identifiers.add("(" + np.symbol().getText() + ")");
                                    } else if (np.nodeLabels() != null) {
                                        identifiers.add("(" + "nn" + this.ID + np.nodeLabels().getText() + ")");
                                        ID++;
                                    } else {
                                        identifiers.add("(" + "nn" + this.ID + ")");
                                        ID++;
                                    }
                                    pattern += "(";
                                    if (np.symbol() != null)
                                        pattern += np.symbol().getText();
                                    else {
                                        ID--;
                                        pattern += "nn" + this.ID;
                                        ID++;
                                    }
                                    if (np.properties() != null)
                                        pattern += getFullTextOriginal(np.properties());
                                    pattern += ")";
                                }
                                patterns.add("(" + pattern + ")");
                            }
                            
                            else if (randomPathMutationStrategy < 2) {
                                String pattern = "";
                                CypherParser.NodePatternContext np = pe.nodePattern();
                                String tempIdentifiers;
                                if (np.symbol() != null && np.nodeLabels() != null) {
                                    tempIdentifiers = "(" + np.symbol().getText() + np.nodeLabels().getText() + ")";
                                    identifiers.add(tempIdentifiers);
                                    doubleNegationIdentifiers.add(tempIdentifiers);
                                } else if (np.symbol() != null) {
                                    tempIdentifiers = "(" + np.symbol().getText() + ")";
                                    identifiers.add(tempIdentifiers);
                                    doubleNegationIdentifiers.add(tempIdentifiers);
                                } else if (np.nodeLabels() != null) {
                                    tempIdentifiers = "(" + "nn" + this.ID + np.nodeLabels().getText() + ")";
                                    identifiers.add(tempIdentifiers);
                                    doubleNegationIdentifiers.add(tempIdentifiers);
                                    ID++;
                                } else {
                                    tempIdentifiers = "(" + "nn" + this.ID + ")";
                                    identifiers.add(tempIdentifiers);
                                    doubleNegationIdentifiers.add(tempIdentifiers);
                                    ID++;
                                }
                                pattern += "(";
                                if (np.symbol() != null)
                                    pattern += np.symbol().getText();
                                else {
                                    ID--;
                                    pattern += "nn" + this.ID;
                                    ID++;
                                }
                                if (np.properties() != null)
                                    pattern += getFullTextOriginal(np.properties());
                                pattern += ")";
                                for (CypherParser.PatternElemChainContext pec : pe.patternElemChain()) {
                                    np = pec.nodePattern();
                                    CypherParser.RelationshipPatternContext rp = pec.relationshipPattern();
                                    String id = "";
                                    if (rp.relationDetail().symbol() != null) {
                                        id = rp.relationDetail().symbol().getText();
                                    } else {
                                        id = "m" + this.ID;
                                        this.ID++;
                                    }
                                    String lr_id = "";
                                    String rr_id = "";
                                    String lr_p = "";
                                    String rr_p = "";
                                    if (rp.LT() != null) {
                                        lr_id = "<-";
                                        lr_p = "<-";
                                        rr_id = "-";
                                        rr_p = "-";
                                    } else if (rp.GT() != null) {
                                        lr_id = "-";
                                        lr_p = "-";
                                        rr_id = "->";
                                        rr_p = "->";
                                    }
                                    //todo 模式拆分后的关系必须有方向
                                    else {
                                        lr_id = "<-";
                                        rr_id = "-";
                                        lr_p = "-";
                                        rr_p = "-";
                                    }
                                    String r = "()" + lr_id + "[" + id;
                                    if (rp.relationDetail().relationshipTypes() != null) {
                                        r += rp.relationDetail().relationshipTypes().getText();
                                    }
                                    if (rp.relationDetail().rangeLit() != null) {
                                        r += rp.relationDetail().rangeLit().getText();
                                    }
                                    if (rp.relationDetail().properties() != null) {
                                        r += getFullTextOriginal(rp.relationDetail().properties());
                                    }
                                    identifiers.add(r + "]" + rr_id + "()");
                                    if (rp.relationDetail().rangeLit() == null) {
                                        pattern += lr_p + "[" + id + "]" + rr_p;
                                    } else {
                                        pattern += lr_p + "[" + id + rp.relationDetail().rangeLit().getText() + "]" + rr_p;
                                    }
                                    if (np.symbol() != null && np.nodeLabels() != null) {
                                        tempIdentifiers = "(" + np.symbol().getText() + np.nodeLabels().getText() + ")";
                                        identifiers.add(tempIdentifiers);
                                        doubleNegationIdentifiers.add(tempIdentifiers);
                                    } else if (np.symbol() != null) {
                                        tempIdentifiers = "(" + np.symbol().getText() + ")";
                                        identifiers.add(tempIdentifiers);
                                        doubleNegationIdentifiers.add(tempIdentifiers);
                                    } else if (np.nodeLabels() != null) {
                                        tempIdentifiers = "(" + "nn" + this.ID + np.nodeLabels().getText() + ")";
                                        identifiers.add(tempIdentifiers);
                                        doubleNegationIdentifiers.add(tempIdentifiers);
                                        ID++;
                                    } else {
                                        tempIdentifiers = "(" + "nn" + this.ID + ")";
                                        identifiers.add(tempIdentifiers);
                                        doubleNegationIdentifiers.add(tempIdentifiers);
                                        ID++;
                                    }
                                    pattern += "(";
                                    if (np.symbol() != null)
                                        pattern += np.symbol().getText();
                                    else {
                                        ID--;
                                        pattern += "nn" + this.ID;
                                        ID++;
                                    }
                                    if (np.properties() != null)
                                        pattern += getFullTextOriginal(np.properties());
                                    pattern += ")";
                                }
                                patterns.add("(" + pattern + ")");
                            }
                            
                            
                            else if (randomPathMutationStrategy < 4){
                                StringBuilder pattern = new StringBuilder();
                                ArrayList<String> ids = new ArrayList<>();

                                if (globalState.getDatabaseName().contains("neo4j") && ctx.pattern().patternPart().size() ==1 && r.getInteger(0,100)< 20){
                                    pattern.append("ALL SHORTEST ");
                                }

                                CypherParser.NodePatternContext np = pe.nodePattern();
                                if (np.symbol() != null && np.nodeLabels() != null) {
                                    pattern.append("(").append(np.symbol().getText()).append(np.nodeLabels().getText());
                                } else if (np.symbol() != null) {
                                    pattern.append("(").append(np.symbol().getText());
                                } else if (np.nodeLabels() != null) {
                                    pattern.append("(").append(np.nodeLabels().getText());
                                }

                                if (np.properties() != null)
                                    pattern.append(np.properties());
                                pattern.append(")");
                                for (CypherParser.PatternElemChainContext pec : pe.patternElemChain()) {
                                    np = pec.nodePattern();
                                    CypherParser.RelationshipPatternContext rp = pec.relationshipPattern();
                                    String id = "";
                                    if (rp.relationDetail().symbol() != null) {
                                        id = rp.relationDetail().symbol().getText();
                                    } else if(rp.relationDetail().rangeLit()==null) {
                                        id = "m" + this.ID;
                                        this.ID++;
                                    }
                                    ids.add(id);
                                    String lr_id = "";
                                    String rr_id = "";
                                    if (rp.LT() != null) {
                                        lr_id = "<-";
                                        rr_id = "-";
                                    } else if (rp.GT() != null) {
                                        lr_id = "-";
                                        rr_id = "->";
                                    }
                                    //todo 模式拆分后的关系必须有方向
                                    else {
                                        lr_id = "-";
                                        rr_id = "-";
                                    }
                                    pattern.append(lr_id).append("[").append(id);
                                    if (rp.relationDetail().relationshipTypes() != null) {
                                        pattern.append(rp.relationDetail().relationshipTypes().getText()) ;
                                    }
                                    if (rp.relationDetail().rangeLit() != null) {
                                        pattern.append(rp.relationDetail().rangeLit().getText());
                                    }else {
                                        if (r.getInteger(0,3) == 0 && !(globalState.getDatabaseName().contains("nebula") && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() != null)){
                                            pattern.append("*1..").append(r.getInteger(1,5));
                                        }else {
                                            pattern.append("*1..1");
                                        }
                                    }
                                    if (rp.relationDetail().properties() != null) {
                                        pattern.append(getFullTextOriginal(rp.relationDetail().properties()));
                                    }
                                    pattern.append("]" + rr_id);
                                    if (np.symbol() != null && np.nodeLabels() != null) {
                                        pattern.append("(" + np.symbol().getText() + np.nodeLabels().getText() );
                                    } else if (np.symbol() != null) {
                                        pattern.append("(" + np.symbol().getText());
                                    } else if (np.nodeLabels() != null) {
                                        pattern.append("("+ np.nodeLabels().getText());
                                    }
                                    if (np.properties() != null)
                                        pattern.append(getFullTextOriginal(np.properties())) ;
                                    pattern.append(")") ;
                                }
                                identifiers.add(pattern.toString());
                                for(String id : ids){
                                    if (!globalState.getDatabaseName().contains("agens") && !globalState.getDatabaseName().contains("nebula")){
                                        patterns.add("SIZE(" + id + ")=1 " + "AND ");
                                    }else if (globalState.getDatabaseName().contains("agens")){
                                        patterns.add("length(" + id + ")=1 " + "AND ");
                                    }else if (globalState.getDatabaseName().contains("nebula") && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() == null){
                                        patterns.add("SIZE(" + id + ")==1 " + "AND ");
                                    }
                                }
                            }
                            
                            else if (randomPathMutationStrategy == 4){
                                StringBuilder pattern = new StringBuilder();
                                ArrayList<String> ids = new ArrayList<>();

                                CypherParser.NodePatternContext np = pe.nodePattern();
                                if (np.symbol() != null && np.nodeLabels() != null) {
                                    pattern.append("(").append(np.symbol().getText()).append(np.nodeLabels().getText());
                                } else if (np.symbol() != null) {
                                    pattern.append("(").append(np.symbol().getText());
                                } else if (np.nodeLabels() != null) {
                                    pattern.append("(").append(np.nodeLabels().getText());
                                }

                                if (np.properties() != null)
                                    pattern.append(np.properties());
                                pattern.append(")");
                                for (int j = 0; j < pe.patternElemChain().size(); j++) {
                                    CypherParser.PatternElemChainContext pec = pe.patternElemChain().get(j);
                                    np = pec.nodePattern();
                                    CypherParser.RelationshipPatternContext rp = pec.relationshipPattern();
                                    String id = "";
                                    if (rp.relationDetail().symbol() != null) {
                                        id = rp.relationDetail().symbol().getText();
                                    }
                                    ids.add(id);
                                    String lr_id = "";
                                    String rr_id = "";
                                    if (rp.LT() != null) {
                                        lr_id = "<-";
                                        rr_id = "-";
                                    } else if (rp.GT() != null) {
                                        lr_id = "-";
                                        rr_id = "->";
                                    }
                                    //todo 模式拆分后的关系必须有方向
                                    else {
                                        lr_id = "-";
                                        rr_id = "-";
                                    }
                                    if (j == varLengthPatternIndex){
                                        for (int k = lowBound.get(boundIndex); k <= upperBound.get(boundIndex); k++) {
                                            if (k==0) continue;
                                            StringBuilder tempRel = new StringBuilder();
                                            if (r.getInteger(0,3) < 2) {
                                                for (int l = 0; l < k; l++) {
                                                    if (r.getInteger(0, 3) < 2) {
                                                        tempRel.append(lr_id).append("[]").append(rr_id);
                                                    } else {
                                                        tempRel.append(lr_id).append("[*1]").append(rr_id);
                                                    }
                                                    if (l != k - 1) {
                                                        tempRel.append("()");
                                                    }
                                                }
                                            }else {
                                                tempRel.append(lr_id).append("[*").append(k).append("]").append(rr_id);
                                            }
                                            if (np.symbol() != null && np.nodeLabels() != null) {
                                                tempRel.append("(" + np.symbol().getText() + np.nodeLabels().getText());
                                            } else if (np.symbol() != null) {
                                                tempRel.append("(" + np.symbol().getText());
                                            } else if (np.nodeLabels() != null) {
                                                tempRel.append("(" + np.nodeLabels().getText());
                                            }
                                            if (np.properties() != null)
                                                tempRel.append(getFullTextOriginal(np.properties()));
                                            tempRel.append(")");
                                            varLengthPartitionIdentifierBuilders.add(new StringBuilder().append(pattern).append(tempRel));
                                        }
                                        pattern = new StringBuilder();
                                    }else {
                                        pattern.append(lr_id).append("[").append(id);
                                        if (rp.relationDetail().relationshipTypes() != null) {
                                            pattern.append(rp.relationDetail().relationshipTypes().getText());
                                        }

                                        if (rp.relationDetail().rangeLit() != null) {
                                            pattern.append(rp.relationDetail().rangeLit().getText());
                                        }
                                        if (rp.relationDetail().properties() != null) {
                                            pattern.append(getFullTextOriginal(rp.relationDetail().properties()));
                                        }
                                        pattern.append("]" + rr_id);
                                        if (np.symbol() != null && np.nodeLabels() != null) {
                                            pattern.append("(" + np.symbol().getText() + np.nodeLabels().getText());
                                        } else if (np.symbol() != null) {
                                            pattern.append("(" + np.symbol().getText());
                                        } else if (np.nodeLabels() != null) {
                                            pattern.append("(" + np.nodeLabels().getText());
                                        }
                                        if (np.properties() != null)
                                            pattern.append(getFullTextOriginal(np.properties()));
                                        pattern.append(")");
                                    }
                                }
                                for (int k = 0; k <= upperBound.get(boundIndex)-lowBound.get(boundIndex); k++) {
                                    varLengthPartitionIdentifiers.add(varLengthPartitionIdentifierBuilders.get(k) + pattern.toString());
                                }
                                identifiers.add(pattern.toString());
                            }
                            
                            else{
                                identifiers.add(getFullTextOriginal(p));
                            }
                        }
                    }
                }
                //todo 不拆分
                else {
                    identifiers.add(getFullTextOriginal(p));
                }
            }

            if (varLengthPartition){
                if (inUnionPartition){
                    for (int j = 0; j < identifiers.size(); j++) {
                        if (j != random){
                            result_qurey += identifiers.get(j) + ",";
                        }else {
                            unionPartitionIndex = result_qurey.length();
                            result_qurey += varLengthPartitionIdentifiers.get(0) + ",";
                        }
                    }
                    result_qurey = result_qurey.substring(0, result_qurey.length()-1) + " ";
                    if (r.getInteger(0, 6) == 1)
                        result_qurey += with_operator.get(0);
                    if (ctx.where() != null) {
                        visitChildren(ctx.where());
                    } else if (r.getInteger(0, 9) == 0 && !(globalState.getDatabaseName().contains("nebula") && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() != null))
                        result_qurey += where_operator.get(0);
                    isUnionPartition = false;
                    unionPartitionPattern.addAll(varLengthPartitionIdentifiers);
                }else {
                    for (int i = 0; i <= upperBound.get(boundIndex) - lowBound.get(boundIndex); i++) {
                        if (i != 0){
                            result_qurey += "MATCH ";
                        }
                        for (int j = 0; j < identifiers.size(); j++) {
                            if (j != random){
                                result_qurey += identifiers.get(j) + ",";
                            }else {
                                result_qurey += varLengthPartitionIdentifiers.get(i) + ",";
                            }
                        }
                        result_qurey = result_qurey.substring(0, result_qurey.length()-1) + " ";
                        if (r.getInteger(0, 6) == 1 && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() == null && globalState.getOptions().getRelation_removed() != 2)
                            result_qurey += with_operator.get(0);
                        if (ctx.where() != null) {
                            visitChildren(ctx.where());
                        } else if (r.getInteger(0, 9) == 0 && !(globalState.getDatabaseName().contains("nebula") && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() != null))
                            result_qurey += where_operator.get(0);

                        result_qurey += "RETURN ";
                        for (int k = 0; k < avaliableLocalIdentifiers.size(); k++){
                            result_qurey += avaliableLocalIdentifiers.get(k) + ",";
                        }
                        if (avaliableLocalIdentifiers.isEmpty()){
                            result_qurey += call_return_operator.get(0) + call_return_id + " ";
                        }
                        result_qurey = result_qurey.substring(0, result_qurey.length()-1) + " ";
                        if (i != upperBound.get(boundIndex) - lowBound.get(boundIndex)){
                            result_qurey += "UNION ALL ";
                        }
                    }
                    if (avaliableLocalIdentifiers.isEmpty()){
                        call_return_id++;
                    }
                }
            }else {
                if (identifiers.isEmpty())
                    result_qurey += "() ";
                else {
                    for (String i : identifiers)
                        result_qurey += i + ",";
                    result_qurey = result_qurey.substring(0, result_qurey.length() - 1) + " ";
                }
                //todo 延迟过滤策略只能应用于MATCH而不能用于OPTIONAL MATCH，详情见OPTIONAL MATCH文档
                if (r.getInteger(0, 6) == 1 && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() == null && globalState.getOptions().getRelation_removed() != 2)
                    result_qurey += with_operator.get(0);
                if (patterns.size() != 0 || single_node_patterns.size() != 0) {
                    result_qurey += "WHERE ";
                    for (String p : patterns) {
                        if (randomPathMutationStrategy < 1) {
                            result_qurey += "exists" + p + " AND ";
                        } else if (randomPathMutationStrategy < 2) {
                            result_qurey += "NOT exists{";
                            for (String i : doubleNegationIdentifiers) {
                                result_qurey += i + ",";
                            }
                            result_qurey = result_qurey.substring(0, result_qurey.length() - 1) + " ";
                            result_qurey += "WHERE NOT " + p + "} AND ";

                        } else if (randomPathMutationStrategy < 5) {
                            result_qurey += p;
                        }
                    }
                    for (String s : single_node_patterns)
                        result_qurey += s + " AND ";
                    if (ctx.where() != null) {
                        result_qurey += "(";
                        visitChildren(ctx.where().expression());
                        result_qurey += ")";
                    } else {
                        result_qurey = result_qurey.substring(0, result_qurey.length() - 4);
                    }

                    result_qurey += "WITH ";
                    for (String avaliableIdentifier : avaliableIdentifiers){
                        result_qurey += avaliableIdentifier + ", ";
                    }
                    result_qurey = result_qurey.substring(0, result_qurey.length() - 2) + " ";

                } else if (ctx.where() != null) {
                    visitChildren(ctx.where());
                } else if (r.getInteger(0, 9) == 0 && !(globalState.getDatabaseName().contains("nebula") && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() != null))
                    result_qurey += where_operator.get(0);
            }
        }
        //不进行模式拆分
        else {
            for (int i = 0; i < ctx.pattern().patternPart().size(); i++) {
                CypherParser.PatternPartContext patternPartContext = ctx.pattern().patternPart(i);
                    visitChildren(patternPartContext);
                if (i < ctx.pattern().patternPart().size() - 1)
                    result_qurey += ",";
            }
            //todo 延迟过滤策略
            if (r.getInteger(0, 6) == 1 && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() == null && globalState.getOptions().getRelation_removed() != 2)
                result_qurey += with_operator.get(0);
            if (ctx.where() != null)
                visitChildren(ctx.where());
                //变异where true
            else if (r.getInteger(0, 9) == 0 && !(globalState.getDatabaseName().contains("nebula") && ((CypherParser.MatchStContext) ctx.parent).OPTIONAL() != null)) {
                result_qurey += where_operator.get(0);
            }
        }
        return null;
    }

    @Override
    public String visitMatchSt(CypherParser.MatchStContext ctx) {
        
        updateIdentifiers(ctx.patternWhere());

        
        int varPartitionStrategy = r.getInteger(0,6);
        if (varPartitionStrategy < 4) {
            if (isUnionPartition && ctx.OPTIONAL() == null){
                varLengthPartition = true;
                inUnionPartition = true;

                visitChildren(ctx);

                varLengthPartition = false;
                inUnionPartition = false;
            }
            
            else if (!globalState.getDatabaseName().contains("janus") && !globalState.getDatabaseName().contains("agens") && !globalState.getDatabaseName().contains("nebula")){
                varLengthPartition = true;
                if (ctx.OPTIONAL() == null){
                    result_qurey += globalState.getDatabaseName().contains("mem")?"CALL{":"CALL(*){";
                }else {
                    
                    if (globalState.getDatabaseName().contains("mem")){
                        varLengthPartition = false;
                    }else{
                        result_qurey += "OPTIONAL CALL(*){";
                        optionalMatch = true;
                    }
                }
                visitChildren(ctx);
                if (varLengthPartition){
                    result_qurey += "}";
                    
                    if (globalState.getDatabaseName().contains("neo4j") && r.getInteger(0,2) == 1 && !isUnionPartition && unionPartitionPattern.isEmpty()) {
                        if (r.getInteger(0,2) < 1) {
                            result_qurey += " IN TRANSACTIONS ";
                        }else {
                            result_qurey += " IN TRANSACTIONS OF " + r.getInteger(1, 5) + " ROW ";
                        }
                    }
                    varLengthPartition = false;
                    optionalMatch = false;
                }
            }else {
                visitChildren(ctx);
            }
        }
        else{
            visitChildren(ctx);
        }
        
        avaliableLocalIdentifiersClear();
        return null;
    }

    @Override
    public String visitUnwindSt(CypherParser.UnwindStContext ctx) {
        visitChildren(ctx);
        updateIdentifiers(ctx);
        return null;
    }


    @Override
    public String visitReadingStatement(CypherParser.ReadingStatementContext ctx) {
        visitChildren(ctx);
        if (true) {
            //with mutation
            if (r.getInteger(0, 6) == 0 && !(ctx.parent instanceof CypherParser.ForeachStContext) && globalState.getOptions().getRelation_removed() != 2) {
                result_qurey += with_operator.get(0);
            }
        }
        return null;
    }

    @Override
    public String visitWithSt(CypherParser.WithStContext ctx) {
        result_qurey += "WITH ";
        updateIdentifiers(ctx);
        visitChildren(ctx.projectionBody());
        if (ctx.where() != null)
            visitChildren(ctx.where());
        else {
            if (r.getInteger(0, 9) == 0 && !(ctx.parent.parent instanceof CypherParser.QueryCallStContext))
                result_qurey += where_operator.get(0);
        }
        if (true) {
            //with mutation
            if (r.getInteger(0, 9) == 0 && !(ctx.parent instanceof CypherParser.ForeachStContext) && globalState.getOptions().getRelation_removed() != 2) {
                result_qurey += with_operator.get(0);
            }
        }
        return null;
    }

    @Override
    public String visitWhere(CypherParser.WhereContext ctx) {
        in_where = true;
        visitChildren(ctx);
        in_where = false;
        return null;
    }

    @Override
    public String visitProjectionBody(CypherParser.ProjectionBodyContext ctx) {
        if (ctx.DISTINCT() != null)
            result_qurey += "DISTINCT ";

        visitChildren(ctx.projectionItems());
        //order by mutation
        if (ctx.orderSt() == null && r.getInteger(0, 9) == 0 && globalState.getOptions().getRelation_removed() != 3 && !globalState.getDatabaseName().contains("agens")) {
            result_qurey += Randomly.fromList(order_operator);
            //desc mutation
            if (r.getInteger(0, 9) == 0)
                result_qurey += desc_operator.get(0);
        }
        if (ctx.orderSt() != null) {
            result_qurey += getFullTextOriginal(ctx.orderSt()) + " ";
            if (r.getInteger(0, 9) == 0 && globalState.getOptions().getRelation_removed() != 3 && !globalState.getDatabaseName().contains("agens")) {
                result_qurey += Randomly.fromList(order_operator_add);
                //desc mutation
                if (r.getInteger(0, 9) == 0)
                    result_qurey += desc_operator.get(0);
            } else if (ctx.orderSt().orderItem().get(ctx.orderSt().orderItem().size() - 1).DESC() == null && r.getInteger(0, 9) == 0)
                result_qurey += desc_operator.get(0);
        }
        //skip mutation
        if (ctx.skipSt() != null)
            visitChildren(ctx.skipSt());

        //limit mutation
        if (ctx.limitSt() != null)
            visitChildren(ctx.limitSt());

        return null;
    }

    @Override
    public String visitSingleQuery(CypherParser.SingleQueryContext ctx) {
        visitChildren(ctx);
        //进行return 变异
        if (r.getInteger(0, 6) == 0 && ctx.returnSt() == null && globalState.getOptions().getRelation_removed() != 3)
            result_qurey += Randomly.fromList(return_operator);
        return null;
    }

    @Override
    public String visitSubqueryCount(CypherParser.SubqueryCountContext ctx) {
        in_subquery = true;
        for (int i = 0; i < ctx.children.size() - 1; i++)
            ctx.getChild(i).accept(this);
        //进行return 变异
        if (r.getInteger(0, 9) == 0 && ctx.returnSt() == null && globalState.getOptions().getRelation_removed() != 3) {
            result_qurey += Randomly.fromList(return_operator);
        }
        result_qurey += "}";
        in_subquery = false;
        return null;
    }

    @Override public String visitScript(CypherParser.ScriptContext ctx) {
        avaliableIdentifiers.clear();
        if (ctx.query().regularQuery().singleQuery().returnSt().projectionBody().DISTINCT() != null) {
            this.isDistinctReturn = true;
        }
        return visitChildren(ctx) ;
    }

    public static String transform(CypherVisitorImp cv, String input) {
        CypherLexer lexer = new CypherLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CypherParser parser = new CypherParser(tokens);
        ParseTree tree = parser.script();

        parser.setBuildParseTree(true);
        cv.visit(tree);
        return cv.Getresult_qurey();
    }
}
