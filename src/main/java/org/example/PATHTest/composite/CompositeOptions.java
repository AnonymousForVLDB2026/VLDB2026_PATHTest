package org.example.PATHTest.composite;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.cypher.dsl.IQueryGenerator;



@Parameters(separators = "=", commandDescription = "Composite (default port: " + CompositeOptions.DEFAULT_PORT
        + ", default host: " + CompositeOptions.DEFAULT_HOST)
public class CompositeOptions implements DBMSSpecificOptions {

    public static final String DEFAULT_HOST = "localhost";
    public static final int DEFAULT_PORT = 2424;

    public String getConfigPath() {
        return configPath;
    }

    @Parameter(names = "--config")
    public String configPath = "./config.json";


    @Override
    public IQueryGenerator<CompositeSchema, CompositeGlobalState> getQueryGenerator() {
        return null;
    }


}
