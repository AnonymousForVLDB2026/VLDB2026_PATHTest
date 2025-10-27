package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.IWith;

public interface IWithAnalyzer extends IWith, IClauseAnalyzer {
    @Override
    IWith getSource();
}
