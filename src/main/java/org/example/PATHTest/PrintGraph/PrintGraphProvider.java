package org.example.PATHTest.PrintGraph;

import com.google.gson.JsonObject;
import org.example.PATHTest.MainOptions;
import org.example.PATHTest.common.log.LoggableFactory;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.cypher.CypherLoggableFactory;
import org.example.PATHTest.cypher.CypherProviderAdapter;

public class PrintGraphProvider extends CypherProviderAdapter<PrintGraphGlobalState, PrintGraphSchema, PrintGraphOptions> {
    public PrintGraphProvider() {
        super(PrintGraphGlobalState.class, PrintGraphOptions.class);
    }

    @Override
    public CypherConnection createDatabase(PrintGraphGlobalState globalState) throws Exception {
        return createDatabaseWithOptions(globalState.getOptions(), globalState.getDbmsSpecificOptions());
    }

    @Override
    public String getDBMSName() {
        return "printgraph";
    }

    @Override
    public LoggableFactory getLoggableFactory() {
        return new CypherLoggableFactory();
    }

    @Override
    protected void checkViewsAreValid(PrintGraphGlobalState globalState) {

    }

    @Override
    public void generateDatabase(PrintGraphGlobalState globalState) throws Exception {

    }

    @Override
    public PrintGraphOptions generateOptionsFromConfig(JsonObject config) {
        return PrintGraphOptions.parseOptionFromFile(config);
    }

    @Override
    public CypherConnection createDatabaseWithOptions(MainOptions mainOptions, PrintGraphOptions specificOptions) throws Exception {
        String username = specificOptions.getUsername();
        String password = specificOptions.getPassword();
        String host = specificOptions.getHost();
        int port = specificOptions.getPort();
        if (host == null) {
            host = PrintGraphOptions.DEFAULT_HOST;
        }
        if (port == MainOptions.NO_SET_PORT) {
            port = PrintGraphOptions.DEFAULT_PORT;
        }
        PrintGraphConnection con = null;
        try{
            con = new PrintGraphConnection(specificOptions);
            con.executeStatement("MATCH (n) DETACH DELETE n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
