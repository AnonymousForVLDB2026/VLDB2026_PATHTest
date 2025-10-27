package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.IMerge;

public interface IMergeAnalyzer extends IMerge, IClauseAnalyzer {
    @Override
    IMerge getSource();
}
