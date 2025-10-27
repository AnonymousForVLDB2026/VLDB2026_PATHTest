package org.example.PATHTest.arcadeDB;

import java.util.Arrays;
import java.util.List;

import org.example.PATHTest.cypher.ast.analyzer.ICypherTypeDescriptor;
import org.example.PATHTest.arcadeDB.ArcadeDBSchema.ArcadeDBTable;
import org.example.PATHTest.cypher.standard_ast.CypherType;
import org.example.PATHTest.cypher.standard_ast.CypherTypeDescriptor;
import org.example.PATHTest.common.schema.AbstractTable;
import org.example.PATHTest.common.schema.AbstractTableColumn;
import org.example.PATHTest.common.schema.TableIndex;
import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.cypher.schema.IFunctionInfo;
import org.example.PATHTest.cypher.schema.IParamInfo;

public class ArcadeDBSchema extends CypherSchema<ArcadeDBGlobalState, ArcadeDBTable> {




    //todo complete
    public ArcadeDBSchema(List<ArcadeDBTable> databaseTables, List<CypherLabelInfo> labels,
                            List<CypherRelationTypeInfo> relationTypes, List<CypherPatternInfo> patternInfos) {
        super(databaseTables, labels, relationTypes, patternInfos);
    }

    @Override
    public List<IFunctionInfo> getFunctions() {
        return Arrays.asList(ArcadeDBBuiltInFunctions.values());
    }


    public enum ArcadeDBBuiltInFunctions implements IFunctionInfo{
        AVG("avg", "avg@number", CypherType.NUMBER, new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        MAX_NUMBER("max", "max@number", CypherType.NUMBER, new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        MAX_STRING("max", "max@string", CypherType.STRING, new CypherParamInfo(CypherType.STRING, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.STRING);
            }
        },
        MIN_NUMBER("min", "min@number", CypherType.NUMBER, new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        MIN_STRING("min", "min@string", CypherType.STRING, new CypherParamInfo(CypherType.STRING, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.STRING);
            }
        },
        PERCENTILE_COUNT_NUMBER("percentileCount", "percentileCount@number", CypherType.NUMBER,
                new CypherParamInfo(CypherType.NUMBER, false), new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        PERCENTILE_COUNT_STRING("percentileCount", "percentileCount@string", CypherType.NUMBER,
                new CypherParamInfo(CypherType.STRING, false), new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        PERCENTILE_DISC_NUMBER("percentileDisc", "percentileDisc@number", CypherType.NUMBER,
                new CypherParamInfo(CypherType.NUMBER, false), new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        PERCENTILE_DISC_STRING("percentileDisc", "percentileDisct@string", CypherType.NUMBER,
                new CypherParamInfo(CypherType.STRING, false), new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        ST_DEV("stDev", "stDev", CypherType.NUMBER, new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        ST_DEV_P("stDevP", "stDevP", CypherType.NUMBER, new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        SUM("sum", "sum", CypherType.NUMBER, new CypherParamInfo(CypherType.NUMBER, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.NUMBER);
            }
        },
        COLLECT("collect", "collect", CypherType.LIST, new CypherParamInfo(CypherType.ANY, false)){
            @Override
            public ICypherTypeDescriptor calculateReturnType(List<IExpression> params) {
                return new CypherTypeDescriptor(CypherType.UNKNOWN);
            }
        }
        ;

        ArcadeDBBuiltInFunctions(String name, String signature, CypherType expectedReturnType, IParamInfo... params){
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

    public enum ArcadeDBDataType{

    }
    public static class ArcadeDBTable extends AbstractTable<ArcadeDBTableColumn, TableIndex, ArcadeDBGlobalState> {

        //todo complete
        public ArcadeDBTable(String name, List<ArcadeDBTableColumn> columns, List<TableIndex> indexes, boolean isView) {
            super(name, columns, indexes, isView);
        }

        @Override
        public long getNrRows(ArcadeDBGlobalState globalState) {
            return 0;
        }
    }

    public static class ArcadeDBTableColumn extends AbstractTableColumn<ArcadeDBTable, ArcadeDBDataType> {
        //todo complete
        public ArcadeDBTableColumn(String name, ArcadeDBTable table, ArcadeDBDataType type) {
            super(name, table, type);
        }
    }
}
