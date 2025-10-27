package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.ast.analyzer.IReturnAnalyzer;
import org.example.PATHTest.cypher.ast.analyzer.IWithAnalyzer;

public interface IAliasGenerator {
    void fillReturnAlias(IReturnAnalyzer returnClause);
    void fillWithAlias(IWithAnalyzer withClause);
}
