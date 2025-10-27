package org.example.PATHTest.janusGraph.gen;

import org.example.PATHTest.cypher.CypherQueryAdapter;
import org.example.PATHTest.janusGraph.JanusGlobalState;

public class JanusNodeGenerator {

    private final JanusGlobalState globalState;
    public JanusNodeGenerator(JanusGlobalState globalState){
        this.globalState = globalState;
    }

    public static CypherQueryAdapter createNode(JanusGlobalState globalState){
        return new JanusNodeGenerator(globalState).generateCreate();
    }

    public CypherQueryAdapter generateCreate(){
        return new CypherQueryAdapter("CREATE (p:Person{id: 1})");
    }
}
