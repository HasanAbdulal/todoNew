package com.think.javaOOP.staticVarMeth;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

/*
 * Create a registration for students
 * */
public class Student {
    private int id; // Unique id for each student
    private String name;
    private String password;
    //private boolean loggedIn = false;
    private static int count = 1; // Initialise the first student id to 1
    private static String college = "ITS"; // All students belong to the same college

    //private static int minPasswordLength = 7; // Minimum password length

    // Constructor
    Student(String name, String password) {
        this.id = count; // Assign the counter-value to the student id
        this.name = name;
        this.password = password;
        count++; // Increment the number of students
    }

    // Check if the student is logged in or not
    public boolean isLoggedIn(int enteredNo, String enteredPass) {
        if (enteredNo == this.id && Objects.equals(enteredPass, this.password)) {
            boolean loggedIn = true;
            return true;
        }
        return false;
    }

    // check the password length
    public static boolean checkPasswordLength(String password) {
        // Minimum password length
        int minPasswordLength = 7;
        if (password.length() >= minPasswordLength) {
            System.out.println("Password is valid");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
