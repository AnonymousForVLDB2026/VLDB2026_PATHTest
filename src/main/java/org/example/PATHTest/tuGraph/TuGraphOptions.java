package org.example.PATHTest.tuGraph;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.gson.JsonObject;
import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.cypher.dsl.IQueryGenerator;

@Parameters(separators = "=", commandDescription = "TuGraph (default port: " + TuGraphOptions.DEFAULT_PORT
        + ", default host: " + TuGraphOptions.DEFAULT_HOST)
public class TuGraphOptions implements DBMSSpecificOptions {
    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 7687; //todo 改为TuGraph 默认port

    public static TuGraphOptions parseOptionFromFile(JsonObject jsonObject){
        TuGraphOptions options = new TuGraphOptions();
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
        if(jsonObject.has("proxy_port")){
            options.proxyPort = jsonObject.get("proxy_port").getAsInt();
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
    public String username = "neo4j";

    @Parameter(names = "--password")
    public String password = "sqlancer";

    @Parameter(names = "--use_jdbc")
    public boolean useJDBC = false;

    @Parameter(names = "--proxy_port")
    public int proxyPort = 0;




    @Override
    public IQueryGenerator getQueryGenerator() {
        return null;
    }
}
