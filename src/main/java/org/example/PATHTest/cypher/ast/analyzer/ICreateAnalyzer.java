package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.ICreate;

public interface ICreateAnalyzer extends ICreate, IClauseAnalyzer {
    @Override
    ICreate getSource();
}
