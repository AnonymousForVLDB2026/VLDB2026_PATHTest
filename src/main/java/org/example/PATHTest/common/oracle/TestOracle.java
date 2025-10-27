package org.example.PATHTest.common.oracle;

import java.io.FileWriter;

public interface TestOracle {

    void check() throws Exception;

    FileWriter getFw();
}
