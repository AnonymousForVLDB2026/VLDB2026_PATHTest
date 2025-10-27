package org.example.PATHTest.janusGraph;

import com.google.gson.JsonObject;
import org.apache.tinkerpop.gremlin.driver.MessageSerializer;
import org.apache.tinkerpop.gremlin.driver.ser.GraphBinaryMessageSerializerV1;
import org.apache.tinkerpop.gremlin.structure.io.binary.GraphBinaryMapper;
import org.example.PATHTest.MainOptions;
import org.example.PATHTest.common.log.LoggableFactory;
import org.example.PATHTest.cypher.*;
import org.example.PATHTest.janusGraph.schema.JanusSchema;
import org.example.PATHTest.janusGraph.gen.JanusGraphGenerator;
import org.apache.tinkerpop.gremlin.driver.Cluster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JanusProvider extends CypherProviderAdapter<JanusGlobalState, JanusSchema, JanusOptions> {
    public JanusProvider() {
        super(JanusGlobalState.class, JanusOptions.class);
    }

    @Override
    public JanusOptions generateOptionsFromConfig(JsonObject config) {
        return JanusOptions.parseOptionFromFile(config);
    }

    @Override
    public CypherConnection createDatabaseWithOptions(MainOptions mainOptions, JanusOptions specificOptions) throws Exception {
        String username = specificOptions.getUsername();
        String password = specificOptions.getPassword();
        String host = specificOptions.getHost();
        int port = specificOptions.getPort();
        if (host == null) {
            host = JanusOptions.DEFAULT_HOST;
        }
        if (port == MainOptions.NO_SET_PORT) {
            port = JanusOptions.DEFAULT_PORT;
        }

        Cluster cluster;
        if(specificOptions.configFile != null){
            cluster = Cluster.open(specificOptions.configFile);
        }
        else{
            
            MessageSerializer<GraphBinaryMapper> serializer = new GraphBinaryMessageSerializerV1();
            Map<String, Object> config = new HashMap<>();
            //config.put(TOKEN_SERIALIZE_RESULT_TO_STRING, true);
            serializer.configure(config, null);

            cluster = Cluster.build()
                    .addContactPoint(host)
                    .port(port)
                    .serializer(serializer)
                    .credentials(username, password)
                    .create();        }
        JanusConnection con = new JanusConnection(cluster);
        con.executeStatement("MATCH (n) DETACH DELETE n");
        return con;
    }


    @Override
    public CypherConnection createDatabase(JanusGlobalState globalState) throws Exception {
       return createDatabaseWithOptions(globalState.getOptions(), globalState.getDbmsSpecificOptions());
    }

    @Override
    public String getDBMSName() {
        return "janusgraph";
    }

    @Override
    public LoggableFactory getLoggableFactory() {
        return new CypherLoggableFactory();
    }

    @Override
    protected void checkViewsAreValid(JanusGlobalState globalState) {

    }

    @Override
    public void generateDatabase(JanusGlobalState globalState) throws Exception {
        List<CypherQueryAdapter> queries = JanusGraphGenerator.createGraph(globalState);
        for(CypherQueryAdapter query : queries){
            globalState.executeStatement(query);
        }
    }
}
