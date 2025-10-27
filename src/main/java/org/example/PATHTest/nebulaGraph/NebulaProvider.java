package org.example.PATHTest.nebulaGraph;

import com.google.gson.JsonObject;
import com.vesoft.nebula.client.graph.net.NebulaPool;
import org.example.PATHTest.MainOptions;
import org.example.PATHTest.agensGraph.AgensGraphOptions;
import org.example.PATHTest.common.log.LoggableFactory;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.cypher.CypherLoggableFactory;
import org.example.PATHTest.cypher.CypherProviderAdapter;


public class NebulaProvider extends CypherProviderAdapter<NebulaGlobalState, NebulaSchema, NebulaOptions> {
    public NebulaProvider(Class<NebulaGlobalState> globalClass, Class<NebulaOptions> optionClass) {
        super(globalClass, optionClass);
    }

    public NebulaProvider() {
        super(NebulaGlobalState.class, NebulaOptions.class);
    }

    @Override
    public CypherConnection createDatabaseWithOptions(MainOptions mainOptions, NebulaOptions specificOptions) throws Exception {
        String username = specificOptions.getUsername();
        String password = specificOptions.getPassword();
        String host = specificOptions.getHost();
        int port = specificOptions.getPort();
        if (host == null) {
            host = AgensGraphOptions.DEFAULT_HOST;
        }
        if (port == MainOptions.NO_SET_PORT) {
            port = AgensGraphOptions.DEFAULT_PORT;
        }
        NebulaConnection connection;

        NebulaPool pool= NebulaPoolManager.getPool(host, port, username, password);

        connection = new NebulaConnection(pool);
        
        System.out.println(NebulaPoolManager.getPoolSize());
        connection.executeStatement("DROP SPACE IF EXISTS " + password);
        System.out.println(password);
        connection.executeStatement("CREATE SPACE IF NOT EXISTS " + password + "(vid_type=FIXED_STRING(30))");
        connection.executeStatement("USE " + password);
        return connection;
    }

    @Override
    public void generateDatabase(NebulaGlobalState globalState) throws Exception {

    }

    @Override
    public NebulaOptions generateOptionsFromConfig(JsonObject config) {
        return NebulaOptions.parseOptionFromFile(config);
    }

    @Override
    public CypherConnection createDatabase(NebulaGlobalState globalState) throws Exception {
        return createDatabaseWithOptions(globalState.getOptions(), globalState.getDbmsSpecificOptions());
    }

    @Override
    public String getDBMSName() {
        return "nebula";
    }

    @Override
    public LoggableFactory getLoggableFactory() {
        return new CypherLoggableFactory();
    }
}
