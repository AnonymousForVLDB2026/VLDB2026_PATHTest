package org.example.PATHTest.agensGraph;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.gson.JsonObject;
import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.cypher.dsl.IQueryGenerator;

@Parameters(separators = "=", commandDescription = "AgensGraph (default port: " + AgensGraphOptions.DEFAULT_PORT
        + ", default host: " + AgensGraphOptions.DEFAULT_HOST)
public class AgensGraphOptions implements DBMSSpecificOptions {

    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 15432;
    @Parameter(names = "--host")
    public String host = DEFAULT_HOST;

    @Parameter(names = "--port")
    public int port = DEFAULT_PORT;

    @Parameter(names = "--username")
    public String username = "postgres";

    @Parameter(names = "--password")
    public String password = "agens";

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

    public static AgensGraphOptions parseOptionFromFile(JsonObject jsonObject){
        AgensGraphOptions options = new AgensGraphOptions();
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
