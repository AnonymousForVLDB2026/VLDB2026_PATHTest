package org.example.PATHTest;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.cypher.dsl.IGraphGenerator;

public interface IGraphGeneratorFactory <G extends CypherGlobalState<?,?>, GG extends IGraphGenerator<G>>{
    GG create(G globalState);
}
