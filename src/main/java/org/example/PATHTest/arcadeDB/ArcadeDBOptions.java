package org.example.PATHTest.arcadeDB;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.gson.JsonObject;
import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.cypher.dsl.IQueryGenerator;

@Parameters(separators = "=", commandDescription = "ArcadeDB (default port: " + ArcadeDBOptions.DEFAULT_PORT
        + ", default host: " + ArcadeDBOptions.DEFAULT_HOST)
public class ArcadeDBOptions implements DBMSSpecificOptions {

    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 5432;

    @Parameter(names = "--host")
    public String host = DEFAULT_HOST;

    @Parameter(names = "--port")
    public int port = DEFAULT_PORT;

    @Parameter(names = "--username")
    public String username = "root";

    @Parameter(names = "--password")
    public String password = "sqlancer";

    public String getHost() {
        return host;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public static ArcadeDBOptions parseOptionFromFile(JsonObject jsonObject){
        ArcadeDBOptions options = new ArcadeDBOptions();
        if(jsonObject.has("host")){
            options.host = jsonObject.get("host").getAsString();
        }
        if(jsonObject.has("port")){
            options.port = jsonObject.get("port").getAsInt();
        }
        if(jsonObject.has("username")){
            options.username = jsonObject.get("username").getAsString();
        }
        if(jsonObject.has("password")){
            options.password = jsonObject.get("password").getAsString();
        }
        return options;
    }


    @Override
    public IQueryGenerator getQueryGenerator() {
        return null;
    }

}
