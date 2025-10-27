package org.example.PATHTest.cypher.ast;

import org.example.PATHTest.cypher.ast.analyzer.ICreateAnalyzer;

public interface ICreate extends ICypherClause{
    IPattern getPattern();
    void setPattern(IPattern pattern);

    @Override
    ICreateAnalyzer toAnalyzer();
}
