package org.example.PATHTest.cypher.ast.analyzer;

import java.util.List;

public interface IContextInfo {
    List<IIdentifierAnalyzer> getIdentifiers();
    IIdentifierAnalyzer getIdentifierByName(String name);
    IClauseAnalyzer getParentClause();
}
