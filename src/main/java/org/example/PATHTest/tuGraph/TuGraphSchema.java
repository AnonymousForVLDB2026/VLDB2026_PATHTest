package org.example.PATHTest.tuGraph;

import org.example.PATHTest.common.schema.AbstractTable;
import org.example.PATHTest.common.schema.AbstractTableColumn;
import org.example.PATHTest.common.schema.TableIndex;
import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.ast.analyzer.ICypherTypeDescriptor;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.cypher.schema.IFunctionInfo;
import org.example.PATHTest.cypher.schema.IParamInfo;
import org.example.PATHTest.cypher.standard_ast.CypherType;
import org.example.PATHTest.cypher.standard_ast.CypherTypeDescriptor;
import org.example.PATHTest.tuGraph.TuGraphSchema.TuGraphTable;

import java.util.Arrays;
import java.util.List;

public class TuGraphSchema extends CypherSchema<TuGraphGlobalState, TuGraphTable>{
    //todo complete
    public TuGraphSchema(List< TuGraphSchema.TuGraphTable > databaseTables, List< CypherSchema.CypherLabelInfo > labels,
            List< CypherSchema.CypherRelationTypeInfo > relationTypes, List< CypherSchema.CypherPatternInfo > patternInfos) {
        super(databaseTables, labels, relationTypes, patternInfos);
    }

    @Override
    public List<IFunctionInfo> getFunctions() {
        return Arrays.asList(TuGraphSchema.TuGraphBuiltInFunctions.values());
    }



    public enum TuGraphBuiltInFunctions implements IFunctionInfo{
        AVG("avg", "avg@number", CypherType.NUMBER, new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        MAX_NUMBER("max", "max@number", CypherType.NUMBER, new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        MAX_STRING("max", "max@string", CypherType.STRING, new CypherSchema.CypherParamInfo(CypherType.STRING, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.STRING);
            }
        },
        MIN_NUMBER("min", "min@number", CypherType.NUMBER, new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        MIN_STRING("min", "min@string", CypherType.STRING, new CypherSchema.CypherParamInfo(CypherType.STRING, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.STRING);
            }
        },
        PERCENTILE_COUNT_NUMBER("percentileCount", "percentileCount@number", CypherType.NUMBER,
                new CypherSchema.CypherParamInfo(CypherType.NUMBER, false), new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        PERCENTILE_COUNT_STRING("percentileCount", "percentileCount@string", CypherType.NUMBER,
                new CypherSchema.CypherParamInfo(CypherType.STRING, false), new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        PERCENTILE_DISC_NUMBER("percentileDisc", "percentileDisc@number", CypherType.NUMBER,
                new CypherSchema.CypherParamInfo(CypherType.NUMBER, false), new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        PERCENTILE_DISC_STRING("percentileDisc", "percentileDisct@string", CypherType.NUMBER,
                new CypherSchema.CypherParamInfo(CypherType.STRING, false), new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        ST_DEV("stDev", "stDev", CypherType.NUMBER, new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        ST_DEV_P("stDevP", "stDevP", CypherType.NUMBER, new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        SUM("sum", "sum", CypherType.NUMBER, new CypherSchema.CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        COLLECT("collect", "collect", CypherType.LIST, new CypherSchema.CypherParamInfo(CypherType.ANY, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.UNKNOWN);
            }
        }
        ;

        TuGraphBuiltInFunctions(String name, String signature, CypherType expectedReturnType, IParamInfo... params){
            this.name = name;
            this.params = Arrays.asList(params);
            this.expectedReturnType = expectedReturnType;
            this.signature = signature;
        }

        private String name, signature;
        private List<IParamInfo> params;
        private CypherType expectedReturnType;


        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getSignature() {
            return signature;
        }

        @Override
        public List<IParamInfo> getParams() {
            return params;
        }

        @Override
        public CypherType getExpectedReturnType() {
            return expectedReturnType;
        }
    }

    public enum TuGraphDataType{

    }
    public static class TuGraphTable extends AbstractTable<TuGraphSchema.TuGraphTableColumn, TableIndex, TuGraphGlobalState> {

        //todo complete
        public TuGraphTable(String name, List<TuGraphSchema.TuGraphTableColumn> columns, List<TableIndex> indexes, boolean isView) {
            super(name, columns, indexes, isView);
        }

        @Override
        public long getNrRows(TuGraphGlobalState globalState) {
            return 0;
        }
    }

    public static class TuGraphTableColumn extends AbstractTableColumn<TuGraphSchema.TuGraphTable, TuGraphSchema.TuGraphDataType> {
        //todo complete
        public TuGraphTableColumn(String name, TuGraphSchema.TuGraphTable table, TuGraphSchema.TuGraphDataType type) {
            super(name, table, type);
        }
    }
}
