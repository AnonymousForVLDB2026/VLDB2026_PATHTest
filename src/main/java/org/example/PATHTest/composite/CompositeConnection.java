package org.example.PATHTest.composite;

import org.example.PATHTest.MainOptions;
import org.example.PATHTest.common.query.GDSmithResultSet;
import org.example.PATHTest.cypher.CypherConnection;
import org.example.PATHTest.cypher.oracle.DifferentialNonEmptyBranchOracle;
import org.example.PATHTest.exceptions.DatabaseCrashException;
import org.example.PATHTest.exceptions.MustRestartDatabaseException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class CompositeConnection extends CypherConnection {

    private List<CypherConnection> connections;
    public static final Long TIMEOUT = 60000L;

    private static boolean bForWhichConnection;
    private MainOptions options;
    public CompositeConnection(List<CypherConnection> connections, MainOptions options){
        this.connections = connections;
        this.options = options;
        this.bForWhichConnection = true;
    }
    public static final int times = 3;

    public Object lock;

    @Override
    public String getDatabaseVersion() {
        return "composite";
    }

    @Override
    public void close() throws Exception {
        for(CypherConnection connection : connections){
            connection.close();
        }
    }

    @Override
    public void executeStatement(String arg) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(connections.size());
        List<Exception> exceptions = new ArrayList<>();
        for(int i = 0; i < connections.size(); i++){
            if (DifferentialNonEmptyBranchOracle.needLabel()){
                CypherConnection connection = connections.get(i);
                connection.executeStatement(arg);
            }else {
                CypherConnection connection = connections.get(i);
                int present = i;
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        List<GDSmithResultSet> result = null;
                        try {
                            connection.executeStatement(arg);

                        } catch (Exception e) {
                            synchronized (exceptions) {
                                exceptions.add(new DatabaseCrashException(e, present));
                            }
                        }
                    }
                });
            }
        }

        executorService.shutdown();
        while(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
            //do nothing
        }
        if(exceptions.size() != 0){
            System.out.println("contains crashes");
            if(exceptions.stream().anyMatch(e->e.getCause() instanceof MustRestartDatabaseException)){
                System.out.println("must restart");
                throw new MustRestartDatabaseException(exceptions.stream().filter(e->e.getCause() instanceof MustRestartDatabaseException).findFirst().get());
            }
            System.out.println("not must restart");
            throw exceptions.get(0);
        }
    }

    @Override
    public List<GDSmithResultSet> executeStatementAndGet(String arg) throws Exception{
        List<GDSmithResultSet> results = new ArrayList<>();

            results.add(null);

        ExecutorService executorService = Executors.newFixedThreadPool(connections.size());
        List<Exception> exceptions = new ArrayList<>();
            
            CypherConnection connection = bForWhichConnection?connections.get(0):connections.get(1);
            bForWhichConnection = !bForWhichConnection;
            executorService.execute(() -> {
                List<GDSmithResultSet> result = null;
                try {
                    result = connection.executeStatementAndGet(arg);
                }  catch (Exception e) {
                    System.out.println(arg);
                    e.printStackTrace();
                    synchronized (exceptions){
                        exceptions.add(e);
                    }
                    result = null;
                }
                if(result != null) {
                    synchronized (results) {
                        results.set(0, result.get(0));
                    }
                }
            });

        executorService.shutdown();
        int totalSeconds = 0;
        while(!executorService.awaitTermination(10, TimeUnit.SECONDS)){
            //do nothing todo: 阻塞等候数据库执行完毕
            totalSeconds += 10;

        }

        if(!options.forceCompareAndIgnoreException()){
            if(exceptions.size() != 0){
                System.out.println("contains crashes");
                if(exceptions.stream().anyMatch(e->e.getCause() instanceof MustRestartDatabaseException)){
                    System.out.println("must restart");
                    throw new MustRestartDatabaseException(exceptions.stream().filter(e->e.getCause() instanceof MustRestartDatabaseException).findFirst().get());
                }
                System.out.println("not must restart");
                throw exceptions.get(0);
            }
            if(results.contains(null)){
                throw new Exception("a specific database failed"); 
            }
        }
        return results;
    }

    @Override
    public List<Long> executeStatementAndGetTime(String arg) throws Exception {
        List<Long> timeList1 = new ArrayList<>();
        List<Long> timeList2 = new ArrayList<>();
        final ExecutorService exec = Executors.newFixedThreadPool(1);

        for (int i = 0; i < times; i++) {
            Long startTime1 = System.currentTimeMillis();
            Callable<Long> call = () -> {
                connections.get(0).executeStatement(arg);
                return System.currentTimeMillis();
            };
            Long endTime1;
            try {
                Future<Long> future = exec.submit(call);
                endTime1 = future.get(TIMEOUT * 3 / 2, TimeUnit.MILLISECONDS) - startTime1;
            } catch (TimeoutException ex) {
                endTime1 = TIMEOUT + 1L;
                System.out.println(ex);
            } catch (Exception e) {
                if (e.getMessage().contains("JedisDataException: Query timed out") || e.getMessage().contains("ClientException: The transaction has been terminated") || e.getMessage().contains("TransientException: Transaction was asked to abort")) {
                    endTime1 = TIMEOUT + 1L;
                    System.out.println(e);
                } else {
                    endTime1 = -1L;
                    System.out.println("Error!");
                    e.printStackTrace();
                }
            }

            Long startTime2 = System.currentTimeMillis();
            call = () -> {
                connections.get(1).executeStatement(arg);
                return System.currentTimeMillis();
            };
            Long endTime2;
            try {
                Future<Long> future = exec.submit(call);
                endTime2 = future.get(TIMEOUT * 3 / 2, TimeUnit.MILLISECONDS) - startTime2;
            } catch (TimeoutException ex) {
                endTime2 = TIMEOUT + 1L;
                System.out.println(ex);
            } catch (Exception e) {
                if (e.getMessage().contains("JedisDataException: Query timed out") || e.getMessage().contains("ClientException: The transaction has been terminated") || e.getMessage().contains("TransientException: Transaction was asked to abort")) {
                    endTime2 = TIMEOUT + 1L;
                    System.out.println(e);
                } else {
                    endTime2 = -1L;
                    System.out.println("Error!");
                    e.printStackTrace();
                }
            }

            timeList1.add(endTime1);
            timeList2.add(endTime2);
            System.out.println(connections.get(0).getDatabaseVersion() + ": " + endTime1 + "; " + connections.get(1).getDatabaseVersion()+": " + endTime2);
        }
        exec.shutdown();
        Collections.sort(timeList1);
        Collections.sort(timeList2);
        return Arrays.asList(timeList1.get(1), timeList2.get(1));
    }
}
