package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.IUnwind;

public interface IUnwindAnalyzer extends IUnwind, IClauseAnalyzer {
    @Override
    IUnwind getSource();
}
