package org.example.PATHTest.cypher.gen.condition;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.ast.analyzer.IMatchAnalyzer;
import org.example.PATHTest.cypher.ast.analyzer.IRelationAnalyzer;
import org.example.PATHTest.cypher.ast.analyzer.IWithAnalyzer;
import org.example.PATHTest.cypher.dsl.BasicConditionGenerator;
import org.example.PATHTest.cypher.gen.expr.NonEmptyExpressionGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.cypher.standard_ast.expr.*;

import java.util.List;
import java.util.Map;

public class GuidedConditionGenerator<S extends CypherSchema<?,?>> extends BasicConditionGenerator<S> {
    private boolean overrideOld;
    private Map<String, Object> varToVal;

    public GuidedConditionGenerator(S schema, boolean overrideOld, Map<String, Object> varToVal) {
        super(schema);
        this.overrideOld = overrideOld;
        this.varToVal = varToVal;
    }

    private static final int NO_CONDITION_RATE = 50, MAX_DEPTH = 1;

    @Override
    public IExpression generateMatchCondition(IMatchAnalyzer matchClause, S schema) {
        IExpression matchCondition = matchClause.getCondition();
        if (matchCondition != null && !overrideOld) {
            return matchCondition;
        }

        Randomly r = new Randomly();
        List<IRelationAnalyzer> relationships = matchClause.getLocalRelationIdentifiers();


        if(r.getInteger(0, 100)< NO_CONDITION_RATE){
            if(relationships.size() != 0){
                IExpression result = new BinaryComparisonExpression(new GetPropertyExpression(new IdentifierExpression(relationships.get(0)), "id"), new ConstExpression(-1), BinaryComparisonExpression.BinaryComparisonOperation.HIGHER);



                for(int x = 0; x < relationships.size(); x++){
                    for(int y = x + 1; y < relationships.size(); y++){
                        result = new BinaryLogicalExpression(result, new BinaryComparisonExpression(new GetPropertyExpression(new IdentifierExpression(relationships.get(x)), "id"), new GetPropertyExpression(new IdentifierExpression(relationships.get(y)), "id"), BinaryComparisonExpression.BinaryComparisonOperation.NOT_EQUAL), BinaryLogicalExpression.BinaryLogicalOperation.AND);
                    }
                }
                return result;
            }
            return null;
        }
        IExpression result = new NonEmptyExpressionGenerator<>(matchClause, schema, varToVal).generateCondition(MAX_DEPTH);


        for(int x = 0; x < relationships.size(); x++){
            for(int y = x + 1; y < relationships.size(); y++){
                result = new BinaryLogicalExpression(result, new BinaryComparisonExpression(new GetPropertyExpression(new IdentifierExpression(relationships.get(x)), "id"), new GetPropertyExpression(new IdentifierExpression(relationships.get(y)), "id"), BinaryComparisonExpression.BinaryComparisonOperation.NOT_EQUAL), BinaryLogicalExpression.BinaryLogicalOperation.AND);
            }
        }
        return result;
    }

    @Override
    public IExpression generateWithCondition(IWithAnalyzer withClause, S schema) {
        IExpression withCondition = withClause.getCondition();
        if (withCondition != null) {
            return withCondition;
        }



        Randomly r = new Randomly();
        if(r.getInteger(0, 100)< NO_CONDITION_RATE){
            return null;
        }
        return new NonEmptyExpressionGenerator<>(withClause, schema, varToVal).generateCondition(MAX_DEPTH);
    }
}
