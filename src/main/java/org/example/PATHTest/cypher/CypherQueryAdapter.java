package org.example.PATHTest.cypher;

import org.example.PATHTest.GlobalState;
import org.example.PATHTest.common.query.ExpectedErrors;
import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.common.query.Query;

import java.util.List;

public class CypherQueryAdapter extends Query<CypherConnection> {

    private final String query;

    public CypherQueryAdapter(String query) {
        this.query = query;
    }

    private String canonicalizeString(String s) {
        if (s.endsWith(";")) {
            return s;
        } else if (!s.contains("--")) {
            return s + ";";
        } else {
            
            return s;
        }
    }

    @Override
    public String getLogString() {
        return getQueryString();
    }

    @Override
    public String getQueryString() {
        return query;
    }

    @Override
    public String getUnterminatedQueryString() {
        return canonicalizeString(query);
    }

    @Override
    public boolean couldAffectSchema() {
        return false;
    }

    @Override
    public <G extends GlobalState<?, ?, CypherConnection>> boolean execute(G globalState, String... fills) throws Exception {
        System.out.println(query);
        globalState.getConnection().executeStatement(query);
        return true;
    }

    @Override
    public <G extends GlobalState<?, ?, CypherConnection>> List<GDSmithResultSet> executeAndGet(G globalState, String... fills) throws Exception {
        return globalState.getConnection().executeStatementAndGet(query);
    }

    @Override
    public <G extends GlobalState<?, ?, CypherConnection>> List<Long> executeAndGetTime(G globalState, String... fills) throws Exception {
        return globalState.getConnection().executeStatementAndGetTime(query);
    }

    @Override
    public ExpectedErrors getExpectedErrors() {
        //todo complete
        return null;
    }
}
