package org.example.PATHTest.cypher.ast;

import org.example.PATHTest.cypher.ast.analyzer.IUnwindAnalyzer;

public interface IUnwind extends ICypherClause{
    IRet getListAsAliasRet();
    void setListAsAliasRet(IRet listAsAlias);

    @Override
    IUnwindAnalyzer toAnalyzer();
}
