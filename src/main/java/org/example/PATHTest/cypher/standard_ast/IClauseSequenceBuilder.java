package org.example.PATHTest.cypher.standard_ast;

import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.ast.IPattern;
import org.example.PATHTest.cypher.ast.IRet;
import org.example.PATHTest.cypher.dsl.IIdentifierBuilder;

public interface IClauseSequenceBuilder {
    IIdentifierBuilder getIdentifierBuilder();

    IOngoingMatch MatchClause();
    IOngoingMatch MatchClause(IExpression condition, IPattern...patternTuple);

    IOngoingMatch OptionalMatchClause();
    IOngoingMatch OptionalMatchClause(IExpression condition, IPattern...patternTuple);

    IClauseSequenceBuilder UnwindClause();
    IClauseSequenceBuilder UnwindClause(IRet listAsAlias);

    interface IOngoingMatch extends IClauseSequenceBuilder{
    }

    IOngoingWith WithClause();
    IOngoingWith WithClause(IExpression condition, IRet...aliasTuple);

    interface IOngoingWith extends IClauseSequenceBuilder{
        IOngoingWith orderBy(boolean isDesc, IExpression ...expression);
        IOngoingWith limit(IExpression expression);
        IOngoingWith skip(IExpression expression);
        IOngoingWith distinct();
    }

    IOngoingReturn ReturnClause(IRet ...returnList);

    interface IOngoingReturn extends IClauseSequenceBuilder{
        IOngoingReturn orderBy(boolean isDesc, IExpression ...expression);
        IOngoingReturn limit(IExpression expression);
        IOngoingReturn skip(IExpression expression);
        IOngoingReturn distinct();
    }

    IClauseSequenceBuilder CreateClause();
    IClauseSequenceBuilder CreateClause(IPattern pattern);

    IClauseSequenceBuilder MergeClause();
    IClauseSequenceBuilder MergeClause(IPattern pattern);

    //public IClauseSequence build(IConditionGenerator conditionGenerator, IAliasGenerator aliasGenerator,
    

    public IClauseSequence build();

    public int getLength();
}
