package org.example.PATHTest.cypher.dsl;

import org.example.PATHTest.cypher.ast.ICopyable;

public interface IIdentifierBuilder extends ICopyable {
    String getNewNodeName();

    String getNewRelationName();

    String getNewAliasName();

    @Override
    IIdentifierBuilder getCopy();
}
