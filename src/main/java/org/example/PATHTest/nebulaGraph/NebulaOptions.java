package org.example.PATHTest.nebulaGraph;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.gson.JsonObject;
import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.cypher.dsl.IQueryGenerator;

@Parameters(separators = "=", commandDescription = "Nebula (default port: " + NebulaOptions.DEFAULT_PORT
        + ", default host: " + NebulaOptions.DEFAULT_HOST)
public class NebulaOptions implements DBMSSpecificOptions {
    public static final String DEFAULT_HOST = "127.0.0.1";
    public static final int DEFAULT_PORT = 9669;

    public static NebulaOptions parseOptionFromFile(JsonObject jsonObject){
        NebulaOptions options = new NebulaOptions();
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
        if(jsonObject.has("use_jdbc")){
            options.useJDBC = jsonObject.get("use_jdbc").getAsBoolean();
        }

        return options;
    }

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


    @Parameter(names = "--host")
    public String host = DEFAULT_HOST;

    @Parameter(names = "--port")
    public int port = DEFAULT_PORT;

    @Parameter(names = "--username")
    public String username = "root";

    @Parameter(names = "--password")
    public String password = "nebula2025";

    @Parameter(names = "--use_jdbc")
    public boolean useJDBC = false;

    @Override
    public IQueryGenerator getQueryGenerator() {
        return null;
    }
}
