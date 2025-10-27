package org.example.PATHTest.arcadeDB;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.arcadeDB.gen.ArcadeDBSchemaGenerator;

public class ArcadeDBGlobalState extends CypherGlobalState<ArcadeDBOptions, ArcadeDBSchema> {

    private ArcadeDBSchema arcadeDBSchema = null;

    public ArcadeDBGlobalState(){
        super();
        System.out.println("new global state");
    }

    @Override
    protected ArcadeDBSchema readSchema() throws Exception {
        if(arcadeDBSchema == null){
            arcadeDBSchema = new ArcadeDBSchemaGenerator(this).generateSchema();
        }
        return arcadeDBSchema;
    }
}
