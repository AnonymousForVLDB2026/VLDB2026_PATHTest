package org.example.PATHTest.tuGraph;

import com.google.gson.JsonObject;
import org.example.PATHTest.MainOptions;
import org.example.PATHTest.common.log.LoggableFactory;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.cypher.CypherLoggableFactory;
import org.example.PATHTest.cypher.CypherProviderAdapter;
import org.example.PATHTest.memGraph.MemGraphOptions;
import org.neo4j.driver.Driver;

public class TuGraphProvider extends CypherProviderAdapter<TuGraphGlobalState, TuGraphSchema, TuGraphOptions> {
    public TuGraphProvider(){
        super(TuGraphGlobalState.class, TuGraphOptions.class);
    }

    @Override
    public CypherConnection createDatabaseWithOptions(MainOptions mainOptions, TuGraphOptions specificOptions) throws Exception {
        String username = specificOptions.getUsername();
        String password = specificOptions.getPassword();
        String host = specificOptions.getHost();
        int port = specificOptions.getPort();
        if (host == null) {
            host = MemGraphOptions.DEFAULT_HOST;
        }
        if (port == MainOptions.NO_SET_PORT) {
            port = MemGraphOptions.DEFAULT_PORT;
        }

        String url = String.format("bolt://%s:%d", host, port);

        Driver driver = TuGraphDriverManager.getDriver(url, username, password);
        TuGraphConnection con = new TuGraphConnection(driver, specificOptions);
        con.executeStatement("CALL db.dropDB()");

        return con;
    }

    @Override
    public void generateDatabase(TuGraphGlobalState globalState) throws Exception {
        //todo no use, just mock here
    }

    @Override
    public TuGraphOptions generateOptionsFromConfig(JsonObject config) {
        return TuGraphOptions.parseOptionFromFile(config);
    }

    @Override
    public CypherConnection createDatabase(TuGraphGlobalState globalState) throws Exception {
        //todo no use, just mock here
        return null;
    }

    @Override
    public String getDBMSName() {
        return "tugraph";
    }

    @Override
    public LoggableFactory getLoggableFactory() {
        return new CypherLoggableFactory();
    }


}
