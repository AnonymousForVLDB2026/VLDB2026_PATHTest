package org.example.PATHTest.tinkerGraph.gen;

import org.example.PATHTest.cypher.CypherQueryAdapter;
import org.example.PATHTest.tinkerGraph.TinkerGlobalState;

public class TinkerNodeGenerator {

    private final TinkerGlobalState globalState;
    public TinkerNodeGenerator(TinkerGlobalState globalState){
        this.globalState = globalState;
    }

    public static CypherQueryAdapter createNode(TinkerGlobalState globalState){
        return new TinkerNodeGenerator(globalState).generateCreate();
    }

    public CypherQueryAdapter generateCreate(){
        return new CypherQueryAdapter("CREATE (p:Person{id: 1})");
    }
}
