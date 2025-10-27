package org.example.PATHTest.cypher.gen.list;

import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.ast.IRet;
import org.example.PATHTest.cypher.ast.analyzer.IUnwindAnalyzer;
import org.example.PATHTest.cypher.dsl.BasicListGenerator;
import org.example.PATHTest.cypher.dsl.IIdentifierBuilder;
import org.example.PATHTest.cypher.gen.expr.NonEmptyExpressionGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.cypher.standard_ast.CypherType;
import org.example.PATHTest.cypher.standard_ast.Ret;

import java.util.Map;

public class GuidedListGenerator<S extends CypherSchema<?,?>> extends BasicListGenerator<S> {
    private boolean overrideOld;
    private Map<String, Object> varToVal;
    public GuidedListGenerator(S schema, IIdentifierBuilder identifierBuilder, boolean overrideOld, Map<String, Object> varToVal) {
        super(schema, identifierBuilder);
        this.overrideOld = overrideOld;
        this.varToVal = varToVal;
    }

    @Override
    public IRet generateList(IUnwindAnalyzer unwindAnalyzer, IIdentifierBuilder identifierBuilder, S schema) {
        //todo
        if(unwindAnalyzer.getListAsAliasRet()!=null && !overrideOld){
            return unwindAnalyzer.getListAsAliasRet();
        }
        IExpression listExpression = new NonEmptyExpressionGenerator<>(unwindAnalyzer, schema, varToVal).generateListWithBasicType(2, CypherType.NUMBER);
        return Ret.createNewExpressionAlias(identifierBuilder, listExpression);
    }
}
