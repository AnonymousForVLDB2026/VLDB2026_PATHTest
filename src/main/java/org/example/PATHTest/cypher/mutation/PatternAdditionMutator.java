package org.example.PATHTest.cypher.mutation;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.*;
import org.example.PATHTest.cypher.dsl.ClauseVisitor;
import org.example.PATHTest.cypher.dsl.IContext;
import org.example.PATHTest.cypher.gen.pattern.RandomPatternGenerator;
import org.example.PATHTest.cypher.mutation.PatternAdditionMutator.PatternAdditionMutatorContext;
import org.example.PATHTest.cypher.schema.CypherSchema;

import java.util.ArrayList;
import java.util.List;

public class PatternAdditionMutator<S extends CypherSchema<?,?>> extends ClauseVisitor<PatternAdditionMutatorContext> implements IClauseMutator {

    private List<ICypherClause> clauses = new ArrayList<>();
    private S schema;

    public PatternAdditionMutator(IClauseSequence clauseSequence, S schema) {
        super(clauseSequence, new PatternAdditionMutatorContext());
        this.schema = schema;
    }

    @Override
    public void mutate() {
        startVisit();
    }

    public static class PatternAdditionMutatorContext implements IContext {

    }

    @Override
    public void visitMatch(IMatch matchClause, PatternAdditionMutatorContext context) {
        clauses.add(matchClause);
    }

    @Override
    public void visitWith(IWith withClause, PatternAdditionMutatorContext context) {
        clauses.add(withClause);
    }

    @Override
    public void visitReturn(IReturn returnClause, PatternAdditionMutatorContext context) {
        clauses.add(returnClause);
    }

    @Override
    public void postProcessing(PatternAdditionMutatorContext context) {
        Randomly randomly = new Randomly();
        if(clauses.size() == 0){
            return;
        }

        ICypherClause clause = clauses.get(randomly.getInteger(0, clauses.size()));

        if(clause instanceof IMatch){
            IMatch match = (IMatch) clause;
            match.getPatternTuple().add(new RandomPatternGenerator<S>(schema, clauseSequence.getIdentifierBuilder(), true)
                    .generateSinglePattern(match.toAnalyzer(), clauseSequence.getIdentifierBuilder(), schema));
        }
        else if(clause instanceof IWith){
            IWith with = (IWith) clause;
            //todo: more
            return;
        }
        else if(clause instanceof IReturn){
            IReturn returnClause = (IReturn) clause;
            //todo: more
            return;
        }
    }
}
