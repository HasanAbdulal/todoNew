package com.think.javaOOP.staticBlockClass;

public class Main {
    /*public static void main(String[] args) {
        // Accessing the static variable of the outer class
        // To access the static variable of the outer class, we need to create an object of the outer class and then 
        // the object to access the static variable, like this so own;
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.display();
    }*/
    static int x = 10;

    static {
        x = 5;
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
    }
}
