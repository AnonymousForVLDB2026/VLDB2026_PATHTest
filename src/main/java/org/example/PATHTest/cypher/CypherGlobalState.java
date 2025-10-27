package org.example.PATHTest.cypher;

import org.example.PATHTest.DBMSSpecificOptions;
import org.example.PATHTest.ExecutionTimer;
import org.example.PATHTest.GlobalState;
import org.example.PATHTest.common.query.Query;
import org.example.PATHTest.common.schema.AbstractSchema;

public abstract class CypherGlobalState <O extends DBMSSpecificOptions, S extends AbstractSchema<?, ?>>
        extends GlobalState<O, S, CypherConnection> {
    @Override
    protected void executeEpilogue(Query<?> q, boolean success, ExecutionTimer timer) throws Exception {
        boolean logExecutionTime = getOptions().logExecutionTime();
        if (success && getOptions().printSucceedingStatements()) {
            System.out.println(q.getQueryString());
        }
        if (logExecutionTime) {
            getLogger().writeCurrent(" -- " + timer.end().asString());
        }
        if (q.couldAffectSchema()) {
            updateSchema();
        }
    }
}
