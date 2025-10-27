package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.ast.analyzer.IUnwindAnalyzer;

public interface IListGenerator {
    void fillUnwindList(IUnwindAnalyzer unwindAnalyzer);
}
