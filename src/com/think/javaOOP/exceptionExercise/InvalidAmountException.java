package com.think.javaOOP.exceptionExercise;

public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super();
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}
