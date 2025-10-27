package org.example.PATHTest.janusGraph;
import org.apache.tinkerpop.gremlin.driver.Client;
import org.apache.tinkerpop.gremlin.driver.Cluster;
import org.apache.tinkerpop.gremlin.driver.MessageSerializer;
import org.apache.tinkerpop.gremlin.driver.ser.GraphBinaryMessageSerializerV1;
import org.apache.tinkerpop.gremlin.structure.io.binary.GraphBinaryMapper;
import org.opencypher.gremlin.client.CypherGremlinClient;
import org.opencypher.gremlin.translation.TranslationFacade;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static org.apache.tinkerpop.gremlin.process.traversal.AnonymousTraversalSource.traversal;

/**
 * @ClassName janusGraphReproduce
 * @Description TODO
 * author anonymous
 * date 2025/4/16 15:00
 * version V1.0
 **/
public class janusGraphReproduce {
    public static Cluster cluster;

    private static void executeCypherOnJanusGraph(String cypher, Client client) throws ExecutionException, InterruptedException {
        CypherGremlinClient translatingGremlinClient = CypherGremlinClient.translating(client);
        String cypher_to_gremlin = (new TranslationFacade()).toGremlinGroovy(cypher);
        System.out.println(cypher_to_gremlin);
        client.submit(cypher_to_gremlin).all().get().stream()
                .map(result -> result.getString())
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
