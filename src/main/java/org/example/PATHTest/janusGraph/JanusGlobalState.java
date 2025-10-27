package org.example.PATHTest.janusGraph;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.janusGraph.gen.JanusSchemaGenerator;
import org.example.PATHTest.janusGraph.schema.JanusSchema;

public class JanusGlobalState extends CypherGlobalState<JanusOptions, org.example.PATHTest.janusGraph.schema.JanusSchema> {

    private JanusSchema JanusSchema = null;

    public JanusGlobalState(){
        super();
        System.out.println("new global state");
    }

    @Override
    protected JanusSchema readSchema() throws Exception {
        if(JanusSchema == null){
            JanusSchema = new JanusSchemaGenerator(this).generateSchema();
        }
        return JanusSchema;
    }
}
