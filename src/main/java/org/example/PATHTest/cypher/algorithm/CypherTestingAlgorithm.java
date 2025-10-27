package org.example.PATHTest.cypher.algorithm;

import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.cypher.CypherProviderAdapter;
import org.example.PATHTest.cypher.schema.CypherSchema;

public abstract class CypherTestingAlgorithm <S extends CypherSchema<G,?>, G extends CypherGlobalState<O, S>,
        O extends DBMSSpecificOptions, C extends CypherConnection>{

    protected CypherProviderAdapter<G,S,O> provider;
    public CypherTestingAlgorithm(CypherProviderAdapter<G,S,O> provider){
        this.provider = provider;
    }

    public abstract void generateAndTestDatabase(G globalState) throws Exception;
}
