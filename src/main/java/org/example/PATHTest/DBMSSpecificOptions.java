package org.example.PATHTest;

import org.example.PATHTest.cypher.dsl.IQueryGenerator;

public interface DBMSSpecificOptions {

    IQueryGenerator getQueryGenerator();

}
