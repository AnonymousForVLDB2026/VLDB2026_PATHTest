package org.example.PATHTest.cypher;

public interface CypherQueryProvider<S> {
    CypherQueryAdapter getQuery(S globalState) throws Exception;
}
