package org.example.PATHTest.composite.gen;

import org.example.PATHTest.cypher.CypherQueryAdapter;
import org.example.PATHTest.cypher.gen.CypherSchemaGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.composite.CompositeGlobalState;
import org.example.PATHTest.composite.CompositeSchema;
import org.example.PATHTest.cypher.schema.IPropertyInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CompositeSchemaGenerator extends CypherSchemaGenerator<CompositeSchema, CompositeGlobalState> {


    public CompositeSchemaGenerator(CompositeGlobalState globalState){
        super(globalState);
    }

    @Override
    public CompositeSchema generateSchemaObject(CompositeGlobalState globalState, List<CypherSchema.CypherLabelInfo> labels, List<CypherSchema.CypherRelationTypeInfo> relationTypes, List<CypherSchema.CypherPatternInfo> patternInfos) throws Exception {































//




































//











        /* Randomly r = new Randomly();
        int numOfIndexes = r.getInteger(5, 8);

        for (int i = 0; i < numOfIndexes; i++) {
            String createIndex = "CREATE PROPERTY INDEX ON ";
            if (Randomly.getBoolean()) {
                CypherSchema.CypherLabelInfo n = labels.get(r.getInteger(0, labels.size() - 1));
                createIndex = createIndex + n.getName() + " (";
                IPropertyInfo p = n.getProperties().get(r.getInteger(0, n.getProperties().size() - 1));
                createIndex = createIndex + p.getKey() + ")";
            } else {
                CypherSchema.CypherRelationTypeInfo re = relationTypes.get(r.getInteger(0, relationTypes.size() - 1));
                createIndex = createIndex + re.getName() + " (";
                IPropertyInfo p = re.getProperties().get(r.getInteger(0, re.getProperties().size() - 1));
                createIndex = createIndex + p.getKey() + ")";
            }
            //System.out.println(createIndex);
            try {
                globalState.executeStatement(new CypherQueryAdapter(createIndex));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        if (globalState.getDatabaseName().contains("nebula")){
            for (CypherSchema.CypherLabelInfo label : labels){
                StringBuilder sb = new StringBuilder();
                sb.append("CREATE TAG IF NOT EXISTS " + label.getName());
                sb.append("(");
                for (IPropertyInfo propertyInfo: label.getProperties()){
                    sb.append(propertyInfo.getKey()).append(" ");
                    switch (propertyInfo.getType()){
                        case STRING:
                            sb.append("string");
                            break;
                        case BOOLEAN:
                            sb.append("bool");
                            break;
                        case NUMBER:
                            sb.append("int");
                            break;
                    }
                    sb.append(", ");

                }
                sb.setLength(sb.length()-2);
                sb.append(")");
                globalState.executeStatement(new CypherQueryAdapter(sb.toString()));
            }
            for (CypherSchema.CypherRelationTypeInfo relationType : relationTypes){
                StringBuilder sb = new StringBuilder();
                sb.append("CREATE EDGE IF NOT EXISTS ").append(relationType.getName());
                sb.append("(");
                for (IPropertyInfo propertyInfo: relationType.getProperties()){
                    sb.append(propertyInfo.getKey()).append(" ");
                    switch (propertyInfo.getType()){
                        case STRING:
                            sb.append("string");
                            break;
                        case BOOLEAN:
                            sb.append("bool");
                            break;
                        case NUMBER:
                            sb.append("int");
                            break;
                    }
                    sb.append(", ");
                }
                sb.setLength(sb.length()-2);
                sb.append(")");
                globalState.executeStatement(new CypherQueryAdapter(sb.toString()));
            }

            
            StringBuilder emptyTag = new StringBuilder();
            StringBuilder emptyEdge = new StringBuilder();
            emptyTag.append("CREATE TAG IF NOT EXISTS ").append("empty_tag()");
            emptyEdge.append("CREATE EDGE IF NOT EXISTS ").append("empty_edge()");
            globalState.executeStatement(new CypherQueryAdapter(emptyTag.toString()));
            globalState.executeStatement(new CypherQueryAdapter(emptyEdge.toString()));
            TimeUnit.SECONDS.sleep(15);
        } else if (globalState.getDatabaseName().contains("tu")) {
            for (CypherSchema.CypherLabelInfo label : labels){
                StringBuilder sb = new StringBuilder();
                sb.append("CALL db.createVertexLabel('").append(label.getName()).append("', 'id', 'id', INT32, false,");
                for (IPropertyInfo propertyInfo: label.getProperties()){
                    sb.append("'").append(propertyInfo.getKey()).append("', ");
                    switch (propertyInfo.getType()){
                        case STRING:
                            sb.append("STRING");
                            break;
                        case BOOLEAN:
                            sb.append("BOOL");
                            break;
                        case NUMBER:
                            sb.append("INT32");
                            break;
                    }
                    sb.append(", true, ");

                }
                sb.setLength(sb.length()-2);
                sb.append(")");
                globalState.executeStatement(new CypherQueryAdapter(sb.toString()));
            }
        }
        return new CompositeSchema(new ArrayList<>(), labels, relationTypes, patternInfos);
    }

}
