package org.example.PATHTest.cypher.ast;

import org.example.PATHTest.cypher.ast.analyzer.IClauseAnalyzer;

public interface ICypherClause extends ITextRepresentation, ICopyable{
    void setNextClause(ICypherClause next);
    ICypherClause getNextClause();
    void setPrevClause(ICypherClause prev);
    ICypherClause getPrevClause();
    IClauseAnalyzer toAnalyzer();

    @Override
    ICypherClause getCopy();

}
