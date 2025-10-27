package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.cypher.CypherQueryAdapter;

import java.util.List;

public interface IGraphGenerator <G extends CypherGlobalState<?,?>> {
    List<CypherQueryAdapter> createGraph(G globalState) throws Exception;
}
