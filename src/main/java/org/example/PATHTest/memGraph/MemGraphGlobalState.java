package org.example.PATHTest.memGraph;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.memGraph.gen.MemGraphSchemaGenerator;

public class MemGraphGlobalState extends CypherGlobalState<MemGraphOptions, MemGraphSchema> {

    private MemGraphSchema memGraphSchema = null;

    public MemGraphGlobalState(){
        super();
        System.out.println("new global state");
    }

    @Override
    protected MemGraphSchema readSchema() throws Exception {
        if(memGraphSchema == null){
            memGraphSchema = new MemGraphSchemaGenerator(this).generateSchema();
        }
        return memGraphSchema;
    }
}
