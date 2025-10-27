package org.example.PATHTest.cypher.standard_ast;

import org.example.PATHTest.Randomly;
import org.example.PATHTest.cypher.ast.ICypherType;

public enum CypherType implements ICypherType {
    NUMBER, BOOLEAN, STRING, NODE, RELATION, UNKNOWN, LIST, MAP, BASIC, ANY;

    public static CypherType getRandomBasicType(){
        Randomly randomly = new Randomly();
        int randomNum = randomly.getInteger(0, 100);
        if(randomNum < 40){
            return NUMBER;
        }
        if(randomNum < 80){
            return STRING;
        }
        return BOOLEAN;
    }
}
