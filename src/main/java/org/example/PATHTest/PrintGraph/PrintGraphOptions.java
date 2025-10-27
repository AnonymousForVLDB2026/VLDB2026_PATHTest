package org.example.PATHTest.PrintGraph;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.gson.JsonObject;
import org.example.PATHTest.DBMSSpecificOptions;

import org.example.PATHTest.cypher.dsl.IQueryGenerator;


@Parameters(separators = "=", commandDescription = "PrintGraph (default port: " + PrintGraphOptions.DEFAULT_PORT
        + ", default host: " + PrintGraphOptions.DEFAULT_HOST)
public class PrintGraphOptions implements DBMSSpecificOptions {

    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 6379;
    public static PrintGraphOptions parseOptionFromFile(JsonObject jsonObject){
        PrintGraphOptions options = new PrintGraphOptions();
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
        if(jsonObject.has("restart-command")){
            options.restartCommand = jsonObject.get("restart-command").getAsString();
        }
        return options;
    }

    @Parameter(names = "--restart-command")
    public String restartCommand = "";



    @Parameter(names = "--host")
    public String host = DEFAULT_HOST;

    @Parameter(names = "--port")
    public int port = DEFAULT_PORT;

    @Parameter(names = "--username")
    public String username = "neo4j";

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


    @Override
    public IQueryGenerator getQueryGenerator() {
        return null;
    }


}
