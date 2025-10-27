package org.example.PATHTest.PrintGraph;

import org.example.PATHTest.cypher.CypherGlobalState;

public class PrintGraphGlobalState extends CypherGlobalState<PrintGraphOptions, PrintGraphSchema> {

    private PrintGraphSchema PrintGraphSchema = null;

    public PrintGraphGlobalState(){
        super();
        System.out.println("new global state");
    }

    @Override
    protected PrintGraphSchema readSchema() throws Exception {
        return PrintGraphSchema;
    }
}
