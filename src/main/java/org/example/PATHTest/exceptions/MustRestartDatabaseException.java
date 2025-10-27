package org.example.PATHTest.exceptions;

public class MustRestartDatabaseException extends RuntimeException{

    public MustRestartDatabaseException(Exception cause){
        super(cause);
    }
}
