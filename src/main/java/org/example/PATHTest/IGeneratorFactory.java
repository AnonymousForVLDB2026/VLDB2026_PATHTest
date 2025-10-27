package org.example.PATHTest;

import org.example.PATHTest.cypher.dsl.IQueryGenerator;

public interface IGeneratorFactory <G extends IQueryGenerator>{
    G create();
}
