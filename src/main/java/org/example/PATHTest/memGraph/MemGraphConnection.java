package org.example.PATHTest.memGraph;

import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.exceptions.MustRestartDatabaseException;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import org.neo4j.driver.exceptions.ServiceUnavailableException;

import java.util.Arrays;
import java.util.List;

public class MemGraphConnection extends CypherConnection {

    private Driver driver;
    private MemGraphOptions options;

    public MemGraphConnection(Driver driver, MemGraphOptions options){
        this.driver = driver;
        this.options = options;
    }


    @Override
    public String getDatabaseVersion() throws Exception {
        //todo complete
        return "memgraph";
    }

    @Override
    public void close() throws Exception {
        MemGraphDriverManager.closeDriver(driver);
    }

    @Override
    public void executeStatement(String arg) throws Exception{
        try ( Session session = driver.session() )
        {
            String greeting = session.writeTransaction( new TransactionWork<String>()
            {
                @Override
                public String execute( Transaction tx )
                {
                    tx.run(arg);
                    return "";
                }
            } );
            //System.out.println( greeting );
        } catch (ServiceUnavailableException e){
            e.printStackTrace();
            Process process = Runtime.getRuntime().exec(options.restartCommand);
            process.waitFor();
            Thread.sleep(10000);
            throw new MustRestartDatabaseException(e);
        }
    }

    @Override
    public List<GDSmithResultSet> executeStatementAndGet(String arg) throws Exception{
        try ( Session session = driver.session() )
        {
            GDSmithResultSet resultSet = new GDSmithResultSet(session.run(arg));
            session.close();
            return Arrays.asList(resultSet);
        } catch (ServiceUnavailableException e){
            e.printStackTrace();
            Process process = Runtime.getRuntime().exec(options.restartCommand);
            process.waitFor();
            Thread.sleep(10000);
            throw new MustRestartDatabaseException(e);
        }
    }
}
