package org.example.PATHTest.cypher.mutation;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.IClauseSequence;
import org.example.PATHTest.cypher.ast.ICypherClause;
import org.example.PATHTest.cypher.ast.IMatch;
import org.example.PATHTest.cypher.ast.IWith;
import org.example.PATHTest.cypher.dsl.ClauseVisitor;
import org.example.PATHTest.cypher.dsl.IContext;
import org.example.PATHTest.cypher.schema.CypherSchema;

import java.util.ArrayList;
import java.util.List;

public class WhereRemovalMutator<S extends CypherSchema<?,?>> extends ClauseVisitor<WhereRemovalMutator.WhereRemovalMutatorContext<S>> implements IClauseMutator  {

    Randomly randomly;
    public List<ICypherClause> matchOrWithList = new ArrayList<>();

    public WhereRemovalMutator(IClauseSequence clauseSequence) {
        super(clauseSequence, new WhereRemovalMutatorContext<>());
        randomly = new Randomly();
    }

    public static class WhereRemovalMutatorContext<S extends CypherSchema<?,?>> implements IContext {
    }

    public void mutate(){
        startVisit();
    }

    @Override
    public void visitMatch(IMatch matchClause, WhereRemovalMutatorContext context) {
        if(matchClause.getCondition() != null){
            matchOrWithList.add(matchClause);
        }
    }

    @Override
    public void visitWith(IWith withClause, WhereRemovalMutatorContext context) {
        if(withClause.getCondition() != null){
            matchOrWithList.add(withClause);
        }
    }

    @Override
    public void postProcessing(WhereRemovalMutatorContext context) {
        if(matchOrWithList.size() == 0){
            return;
        }

        ICypherClause clause = matchOrWithList.get(new Randomly().getInteger(0, matchOrWithList.size()));
        if(clause instanceof IMatch){
            ((IMatch) clause).setCondition(null);
            return;
        }
        else if(clause instanceof IWith){
            ((IWith) clause).setCondition(null);
            return;
        }

        throw new RuntimeException();

    }



}
