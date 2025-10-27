package org.example.PATHTest.tuGraph;

import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.cypher.CypherConnection;
import org.neo4j.driver.*;

import java.util.Arrays;
import java.util.List;

import static org.neo4j.driver.Values.parameters;


public class TuGraphConnection extends CypherConnection {
    private Driver driver;
    private TuGraphOptions options;

    public TuGraphConnection(Driver driver, TuGraphOptions options){
        this.driver = driver;
        this.options = options;
    }


    @Override
    public String getDatabaseVersion() throws Exception {
        //todo complete
        return "tuGraph";
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public void executeStatement(String arg) throws Exception{
        Session session = driver.session(SessionConfig.forDatabase("default"));
        session.run(arg);
    }


    @Override
    public List<GDSmithResultSet> executeStatementAndGet(String arg) throws Exception{
        try ( Session session = driver.session() )
        {
            GDSmithResultSet resultSet = new GDSmithResultSet(session.run(arg));
            resultSet.resolveFloat();
            return Arrays.asList(resultSet);
        }
    }
}