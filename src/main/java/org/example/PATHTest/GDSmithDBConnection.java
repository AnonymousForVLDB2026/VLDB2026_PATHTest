package org.example.PATHTest;

public interface GDSmithDBConnection extends AutoCloseable {

    String getDatabaseVersion() throws Exception;
}
