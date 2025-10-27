package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.IMatch;

public interface IMatchAnalyzer extends IMatch, IClauseAnalyzer {
    @Override
    IMatch getSource();
}
