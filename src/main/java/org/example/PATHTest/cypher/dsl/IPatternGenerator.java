package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.ast.analyzer.IMatchAnalyzer;

public interface IPatternGenerator {
    void fillMatchPattern(IMatchAnalyzer match);
}
