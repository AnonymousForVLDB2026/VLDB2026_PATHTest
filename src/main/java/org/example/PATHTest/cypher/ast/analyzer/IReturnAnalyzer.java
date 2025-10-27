package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.IReturn;

public interface IReturnAnalyzer extends IReturn, IClauseAnalyzer {
    @Override
    IReturn getSource();
}
