package org.example.PATHTest.tinkerGraph;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.tinkerGraph.gen.TinkerSchemaGenerator;
import org.example.PATHTest.tinkerGraph.schema.TinkerSchema;

public class TinkerGlobalState extends CypherGlobalState<TinkerOptions, org.example.PATHTest.tinkerGraph.schema.TinkerSchema> {

    private TinkerSchema TinkerSchema = null;

    public TinkerGlobalState(){
        super();
        System.out.println("new global state");
    }

    @Override
    protected TinkerSchema readSchema() throws Exception {
        if(TinkerSchema == null){
            TinkerSchema = new TinkerSchemaGenerator(this).generateSchema();
        }
        return TinkerSchema;
    }
}
