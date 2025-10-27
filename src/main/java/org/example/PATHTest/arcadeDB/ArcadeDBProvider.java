package org.example.PATHTest.arcadeDB;

import com.google.gson.JsonObject;
import org.example.PATHTest.common.log.LoggableFactory;

import org.example.PATHTest.arcadeDB.gen.ArcadeDBGraphGenerator;
import org.example.PATHTest.MainOptions;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.cypher.CypherLoggableFactory;
import org.example.PATHTest.cypher.CypherProviderAdapter;
import org.example.PATHTest.cypher.CypherQueryAdapter;

import java.sql.*;
import java.util.List;
import java.util.Properties;

public class ArcadeDBProvider extends CypherProviderAdapter<ArcadeDBGlobalState, ArcadeDBSchema, ArcadeDBOptions> {
    public ArcadeDBProvider() {
        super(ArcadeDBGlobalState.class, ArcadeDBOptions.class);
    }

    @Override
    public CypherConnection createDatabase(ArcadeDBGlobalState globalState) throws Exception {
        return createDatabaseWithOptions(globalState.getOptions(), globalState.getDbmsSpecificOptions());
    }

    @Override
    public String getDBMSName() {
        return "arcadedb";
    }

    @Override
    public LoggableFactory getLoggableFactory() {
        return new CypherLoggableFactory();
    }

    @Override
    protected void checkViewsAreValid(ArcadeDBGlobalState globalState) {

    }

    @Override
    public void generateDatabase(ArcadeDBGlobalState globalState) throws Exception {
        List<CypherQueryAdapter> queries = ArcadeDBGraphGenerator.createGraph(globalState);
        for(CypherQueryAdapter query : queries){
            globalState.executeStatement(query);
        }
    }

    @Override
    public ArcadeDBOptions generateOptionsFromConfig(JsonObject config) {
        return ArcadeDBOptions.parseOptionFromFile(config);
    }

    @Override
    public CypherConnection createDatabaseWithOptions(MainOptions mainOptions, ArcadeDBOptions specificOptions) throws Exception {
        String username = specificOptions.getUsername();
        String password = specificOptions.getPassword();
        String host = specificOptions.getHost();
        int port = specificOptions.getPort();
        if (host == null) {
            host = ArcadeDBOptions.DEFAULT_HOST;
        }
        if (port == MainOptions.NO_SET_PORT) {
            port = ArcadeDBOptions.DEFAULT_PORT;
        }

        ArcadeDBConnection con = null;
        Class.forName("org.postgresql.Driver");
        Properties props = new Properties();
        props.setProperty("user", username);
        props.setProperty("password", password);
        props.setProperty("ssl", "false");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/mydb", props);
        con = new ArcadeDBConnection(conn);
        con.executeStatement("MATCH (n) DETACH DELETE n");
        return con;
    }
}
