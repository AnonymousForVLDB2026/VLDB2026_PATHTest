package org.example.PATHTest.cypher.ast;

public interface IPatternElement extends IIdentifier{
    boolean isAnonymous();

    @Override
    IPatternElement getCopy();
}
