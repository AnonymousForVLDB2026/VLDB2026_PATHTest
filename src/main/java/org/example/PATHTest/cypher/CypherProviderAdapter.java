package org.example.PATHTest.cypher;

import org.example.PATHTest.cypher.algorithm.*;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.MainOptions;
import org.example.PATHTest.ProviderAdapter;

public abstract  class CypherProviderAdapter <G extends CypherGlobalState<O, S>, S extends CypherSchema<G,?>, O extends DBMSSpecificOptions> extends ProviderAdapter<G, O, CypherConnection> {

    public CypherProviderAdapter(Class<G> globalClass, Class<O> optionClass) {
        super(globalClass, optionClass);
    }

    @Override
    public void generateAndTestDatabase(G globalState) throws Exception {
        CypherTestingAlgorithm<S,G,O,CypherConnection> algorithm;
        switch (globalState.getOptions().getAlgorithm()){
            case COMPARED3://randGraph, guidedPattern, guidedCondition
                algorithm = new Compared3AlgorithmNew<>(this);
                break;
            default:
                throw new RuntimeException();
        }
        algorithm.generateAndTestDatabase(globalState);
        System.gc();
    }

    @Override
    protected void checkViewsAreValid(G globalState){

    }

    public abstract CypherConnection createDatabaseWithOptions(MainOptions mainOptions, O specificOptions) throws Exception;

}
