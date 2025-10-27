package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.CypherGlobalState;
import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.schema.CypherSchema;

public interface IQueryGenerator <S extends CypherSchema<G,?>,G extends CypherGlobalState<?,S>>{
    IClauseSequence generateQuery(G globalState);
    void addExecutionRecord(IClauseSequence clauseSequence, boolean isBugDetected, int resultSize);

    void addNewRecord(IClauseSequence sequence, boolean bugDetected, int resultLength, byte[] branchInfo, byte[] branchPairInfo);

}
