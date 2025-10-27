package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.ast.analyzer.IMatchAnalyzer;
import org.example.PATHTest.cypher.ast.analyzer.IWithAnalyzer;

public interface IConditionGenerator {
    void fillMatchCondtion(IMatchAnalyzer matchClause);
    void fillWithCondition(IWithAnalyzer withClause);
}
