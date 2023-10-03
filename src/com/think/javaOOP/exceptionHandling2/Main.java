package com.think.javaOOP.exceptionHandling2;

public class Main {
    public static void validate(int number) {
        if (number <= 0) {
            ArithmeticException e = new ArithmeticException("You are not eligible to vote");
            throw e;
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(-1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code...");

        // Executing finally block before throwing exception
        try {
            int x = 3 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            throw new ArithmeticException("New Throw");
        } finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("2.Rest of the code...");

    }
}
