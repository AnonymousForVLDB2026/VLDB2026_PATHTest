package org.example.PATHTest.cypher.mutation;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.ast.IMatch;
import org.example.PATHTest.cypher.dsl.ClauseVisitor;
import org.example.PATHTest.cypher.dsl.IContext;
import org.example.PATHTest.cypher.mutation.OptionalAdditionMutator.OptionalAdditionMutatorContext;

import java.util.ArrayList;
import java.util.List;

public class OptionalAdditionMutator extends ClauseVisitor<OptionalAdditionMutatorContext> implements IClauseMutator  {

    public List<IMatch> matchList = new ArrayList<>();

    public OptionalAdditionMutator(IClauseSequence clauseSequence) {
        super(clauseSequence, new OptionalAdditionMutatorContext());
    }

    @Override
    public void mutate() {
        startVisit();
    }

    public static class OptionalAdditionMutatorContext implements IContext {

    }

    @Override
    public void visitMatch(IMatch matchClause, OptionalAdditionMutatorContext context) {
        if(!matchClause.isOptional()){
            matchList.add(matchClause);
        }
    }

    @Override
    public void postProcessing(OptionalAdditionMutatorContext context) {
        if(matchList.size() == 0){
            return;
        }

        IMatch match = matchList.get(new Randomly().getInteger(0, matchList.size()));
        match.setOptional(true);
    }
}
