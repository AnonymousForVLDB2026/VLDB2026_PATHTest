package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ICypherSchema;
import org.example.PATHTest.cypher.ast.IAlias;
import org.example.PATHTest.cypher.ast.IExpression;


public interface IAliasAnalyzer extends IAlias, IIdentifierAnalyzer {
    @Override
    IAliasAnalyzer getFormerDef();
    void setFormerDef(IAliasAnalyzer formerDef);
    IExpression getAliasDefExpression();

    @Override
    IAlias getSource();

    ICypherTypeDescriptor analyzeType(ICypherSchema cypherSchema);
}
