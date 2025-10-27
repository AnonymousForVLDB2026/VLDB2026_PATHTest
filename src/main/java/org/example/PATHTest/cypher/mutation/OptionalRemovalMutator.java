package org.example.PATHTest.cypher.mutation;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.ast.IMatch;
import org.example.PATHTest.cypher.dsl.ClauseVisitor;
import org.example.PATHTest.cypher.dsl.IContext;
import org.example.PATHTest.cypher.mutation.OptionalRemovalMutator.OptionalRemovalMutatorContext;

import java.util.ArrayList;
import java.util.List;

public class OptionalRemovalMutator extends ClauseVisitor<OptionalRemovalMutatorContext> implements IClauseMutator  {

    public List<IMatch> matchList = new ArrayList<>();

    public OptionalRemovalMutator(IClauseSequence clauseSequence) {
        super(clauseSequence, new OptionalRemovalMutatorContext());
    }

    @Override
    public void mutate() {
        startVisit();
    }

    public static class OptionalRemovalMutatorContext implements IContext {

    }

    @Override

    public void visitMatch(IMatch matchClause, OptionalRemovalMutatorContext context) {
        if(matchClause.isOptional()){
            matchList.add(matchClause);
        }
    }

    @Override
    public void postProcessing(OptionalRemovalMutatorContext context) {
        if(matchList.size() == 0){
            return;
        }

        IMatch match = matchList.get(new Randomly().getInteger(0, matchList.size()));
        match.setOptional(false);
    }
}
