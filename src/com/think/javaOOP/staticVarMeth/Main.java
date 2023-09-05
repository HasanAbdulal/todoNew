package com.think.javaOOP.staticVarMeth;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Karan", "1234");
        Student s2 = new Student("Robben", "5678");
        Student s3 = new Student("Hazan", "91011");
        System.out.println(s1.isLoggedIn(1, "12324"));
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//        System.out.println(s3.toString());
    }
}
