package org.example.PATHTest;

import org.example.PATHTest.common.schema.AbstractSchema;

public interface IDatabaseTestingAlgorithm  <G extends GlobalState<O, ? extends AbstractSchema<G, ?>, C>, O extends DBMSSpecificOptions, C extends GDSmithDBConnection>{
    void generateAndTestDatabase(G globalState) throws Exception;
}
