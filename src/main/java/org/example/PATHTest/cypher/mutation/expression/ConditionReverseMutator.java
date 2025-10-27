package org.example.PATHTest.cypher.mutation.expression;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.standard_ast.expr.BinaryComparisonExpression;
import org.example.PATHTest.cypher.standard_ast.expr.BinaryLogicalExpression;
import org.example.PATHTest.cypher.standard_ast.expr.SingleLogicalExpression;
import org.example.PATHTest.cypher.standard_ast.expr.StringMatchingExpression;

import java.util.ArrayList;
import java.util.List;

public class ConditionReverseMutator extends ExpressionVisitor{
    private List<IExpression> boolExpressions = new ArrayList<>();

    public ConditionReverseMutator(IClauseSequence clauseSequence) {
        super(clauseSequence);
    }

    @Override
    public ExpressionVisitingResult visitBinaryLogicalExpression(ExpressionVisitorContext context, BinaryLogicalExpression expression) {
        boolExpressions.add(expression);
        return ExpressionVisitingResult.continueToVisit();
    }

    @Override
    public ExpressionVisitingResult visitComparisonExpression(ExpressionVisitorContext context, BinaryComparisonExpression expression) {
        boolExpressions.add(expression);
        return ExpressionVisitingResult.continueToVisit();
    }

    @Override
    public ExpressionVisitingResult visitSingleLogicalExpression(ExpressionVisitorContext context, SingleLogicalExpression expression) {
        boolExpressions.add(expression);
        return ExpressionVisitingResult.continueToVisit();
    }

    @Override
    public ExpressionVisitingResult visitStringMatchingExpression(ExpressionVisitorContext context, StringMatchingExpression expression) {
        boolExpressions.add(expression);
        return ExpressionVisitingResult.continueToVisit();
    }

    @Override
    public void postProcessing(ExpressionVisitorContext context) {
        Randomly randomly = new Randomly();
        if(boolExpressions.size() == 0){
            return;
        }

        IExpression expression = boolExpressions.get(randomly.getInteger(0, boolExpressions.size()));

        if(expression.getParentExpression() != null){
            IExpression parent = expression.getParentExpression();
            SingleLogicalExpression reverseCondition = new SingleLogicalExpression(expression, SingleLogicalExpression.SingleLogicalOperation.NOT);
            parent.replaceChild(expression, reverseCondition);
        }
        else if(expression.getExpressionRootClause() != null){
            //todo: more
        }

    }
}
