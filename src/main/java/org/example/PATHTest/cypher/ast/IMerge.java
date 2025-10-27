package org.example.PATHTest.cypher.ast;

import org.example.PATHTest.cypher.ast.analyzer.IMergeAnalyzer;

public interface IMerge extends ICypherClause{
    IPattern getPattern();
    void setPattern(IPattern pattern);

    @Override
    IMergeAnalyzer toAnalyzer();
}
