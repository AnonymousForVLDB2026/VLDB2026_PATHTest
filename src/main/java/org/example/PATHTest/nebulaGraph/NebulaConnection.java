package org.example.PATHTest.nebulaGraph;

import com.vesoft.nebula.client.graph.NebulaPoolConfig;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.data.ResultSet;
import com.vesoft.nebula.client.graph.exception.AuthFailedException;
import com.vesoft.nebula.client.graph.exception.ClientServerIncompatibleException;
import com.vesoft.nebula.client.graph.exception.IOErrorException;
import com.vesoft.nebula.client.graph.exception.NotValidConnectionException;
import com.vesoft.nebula.client.graph.net.NebulaPool;
import com.vesoft.nebula.client.graph.net.Session;
import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.cypher.CypherConnection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class NebulaConnection extends CypherConnection {
    private NebulaPool pool;
    private String space;
    public NebulaConnection(NebulaPool pool) throws IOErrorException, AuthFailedException, ClientServerIncompatibleException, NotValidConnectionException {
        this.pool = pool;
    }

    @Override
    public String getDatabaseVersion() throws Exception {
        
        return "Nebula";
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public void executeStatement(String arg) throws Exception {
        Session session = pool.getSession("root","",false);
        if(space != null){
            session.execute(space);
        }
        ResultSet resultSet = session.execute(arg);
        if (arg.contains("USE")){
            space = arg;
        }
        session.release();
        System.out.println(space);
        System.out.println(resultSet.getErrorMessage());
    }

    @Override
    public List<GDSmithResultSet> executeStatementAndGet(String arg) throws Exception {

        Session session = pool.getSession("root","",false);
        session.execute(space);
        ResultSet resultSet = session.execute(arg);
        GDSmithResultSet gdSmithResultSet = new GDSmithResultSet(resultSet);
        if (resultSet.getErrorMessage().length() > 0) {
            System.out.println(resultSet.getErrorMessage());
            session.release();
            throw new Exception(resultSet.getErrorMessage());
        }
        session.release();
        return Arrays.asList(gdSmithResultSet);
    }
}
