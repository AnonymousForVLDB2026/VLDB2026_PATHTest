package org.example.PATHTest.cypher.mutation;

import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.gen.alias.RandomAliasGenerator;
import org.example.PATHTest.cypher.gen.condition.RandomConditionGenerator;
import org.example.PATHTest.cypher.gen.list.RandomListGenerator;
import org.example.PATHTest.cypher.gen.pattern.RandomPatternGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.cypher.dsl.QueryFiller;

public class ClauseRefillMutator<S extends CypherSchema<?,?>> extends QueryFiller<S> implements IClauseMutator {
    public ClauseRefillMutator(IClauseSequence clauseSequence, S schema) {
        super(clauseSequence,
                new RandomPatternGenerator<>(schema, clauseSequence.getIdentifierBuilder(), true),
                new RandomConditionGenerator<>(schema, true),
                new RandomAliasGenerator<>(schema, clauseSequence.getIdentifierBuilder(), true),
                new RandomListGenerator<>(schema, clauseSequence.getIdentifierBuilder(), true),
                schema, clauseSequence.getIdentifierBuilder());
    }

    @Override
    public void mutate() {
        startVisit();
    }
}
