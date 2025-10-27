package org.example.PATHTest.nebulaGraph;

import com.vesoft.nebula.client.graph.NebulaPoolConfig;
import com.vesoft.nebula.client.graph.data.HostAddress;
import com.vesoft.nebula.client.graph.net.NebulaPool;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NebulaPoolManager {
    private static List<PoolInfo> registeredPools = new ArrayList<>();

    private static class PoolInfo{
        public NebulaPool pool = null;
        public String host = "", username =  "", password = "";
        int port;
        public PoolInfo() {
            this(null, "", 0, "", "");
        }
        public PoolInfo(NebulaPool pool, String host, int port, String username, String password){
            this.pool = pool;
            this.host = host;
            this.port = port;
            this.username = username;
            this.password = password;
        }

    }

    public static NebulaPool getPool(String host, int port, String username, String password) throws UnknownHostException {
        for(PoolInfo poolInfo : registeredPools){
            if (poolInfo.host.equals(host) && poolInfo.port == port && poolInfo.username.equals(username) && poolInfo.password.equals(password)){
                return poolInfo.pool;
            }
        }
        NebulaPoolConfig nebulaPoolConfig = new NebulaPoolConfig().setMaxConnSize(10);
        List<HostAddress> addresses = Arrays.asList(new HostAddress(host, port));
        NebulaPool pool = new NebulaPool();
        pool.init(addresses, nebulaPoolConfig);
        registeredPools.add(new PoolInfo(pool, host, port, username, password));
        return pool;
    }

    public static int getPoolSize(){
        return registeredPools.size();
    }
}
