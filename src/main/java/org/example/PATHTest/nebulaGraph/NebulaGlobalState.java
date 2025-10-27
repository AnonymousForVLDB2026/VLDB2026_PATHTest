package org.example.PATHTest.nebulaGraph;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.nebulaGraph.gen.NebulaSchemaGenerator;

public class NebulaGlobalState extends CypherGlobalState<NebulaOptions, NebulaSchema> {
    private NebulaSchema nebulaSchema = null;

    public NebulaGlobalState() {
        super();
        System.out.println("new NebulaGlobalState");
    }
    @Override
    protected NebulaSchema readSchema() throws Exception {
        if(nebulaSchema == null){
            nebulaSchema = new NebulaSchemaGenerator(this).generateSchema();
        }
        return nebulaSchema;
    }
}
