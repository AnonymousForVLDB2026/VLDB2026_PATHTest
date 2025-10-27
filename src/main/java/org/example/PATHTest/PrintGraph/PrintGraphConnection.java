package org.example.PATHTest.PrintGraph;

import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.cypher.CypherConnection;

import java.util.Arrays;
import java.util.List;

public class PrintGraphConnection extends CypherConnection {
    private String graphName;

    private PrintGraphOptions options;

    public PrintGraphConnection(PrintGraphOptions options){
         this.options = options;
    }


    @Override
    public String getDatabaseVersion() {
        return "Printgraph";
    }

    @Override
    public void close() throws Exception {
    }

    @Override
    public void executeStatement(String arg) throws Exception{
    }

    @Override
    public List<GDSmithResultSet> executeStatementAndGet(String arg) throws Exception{
        return Arrays.asList(new GDSmithResultSet());
    }
}
