package org.example.PATHTest.cypher.gen.list;

import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.ast.IRet;
import org.example.PATHTest.cypher.ast.analyzer.IUnwindAnalyzer;
import org.example.PATHTest.cypher.dsl.BasicListGenerator;
import org.example.PATHTest.cypher.dsl.IIdentifierBuilder;
import org.example.PATHTest.cypher.gen.expr.RandomExpressionGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.cypher.standard_ast.CypherType;
import org.example.PATHTest.cypher.standard_ast.Ret;

public class RandomListGenerator<S extends CypherSchema<?,?>> extends BasicListGenerator<S> {
    private boolean overrideOld;
    public RandomListGenerator(S schema, IIdentifierBuilder identifierBuilder, boolean overrideOld) {
        super(schema, identifierBuilder);
        this.overrideOld = overrideOld;
    }

    @Override
    public IRet generateList(IUnwindAnalyzer unwindAnalyzer, IIdentifierBuilder identifierBuilder, S schema) {
        //todo
        if(unwindAnalyzer.getListAsAliasRet()!=null && !overrideOld){
            return unwindAnalyzer.getListAsAliasRet();
        }
        IExpression listExpression = new RandomExpressionGenerator<>(unwindAnalyzer, schema).generateListWithBasicType(2, CypherType.NUMBER);
        return Ret.createNewExpressionAlias(identifierBuilder, listExpression);
    }
}
