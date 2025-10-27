package org.example.PATHTest.cypher.schema;

import org.example.PATHTest.cypher.standard_ast.CypherType;

public interface IParamInfo {
    boolean isOptionalLength();
    CypherType getParamType();
}
