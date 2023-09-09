package com.think.javaOOP.finalKeyword;

public class Main {
    public static void main(String[] args) {

        // Final reference variable cannot be reassigned, it's not allowed to change the reference
        // It's good practice to declare a reference variable as final if it's not going to be reassigned
        final Student s1 = new Student(31, "John", 1998);
//        s1 = new Student(4331, "John", 1998);
        // s1.STUDENT_ID = 2; // Error: cannot assign a value to final variable STUDENT_ID
        System.out.println(s1.STUDENT_ID);
    }
}
