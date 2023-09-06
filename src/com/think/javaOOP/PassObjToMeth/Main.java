package com.think.javaOOP.PassObjToMeth;

public class Main {
    static void fun1(int n) {
        n++;
    }

    static void fun(Test obj) {
        obj.number++;
    }

    public static void main(String[] args) {
        // Call by value, the value of num is not changed.
        int num = 1;
        fun1(num);
        System.out.println("Number call: " + num); // Number call:1

        // Call by reference, the value of obj.number is changed.
        Test obj = new Test();
        obj.number = 1;
        fun(obj);
        System.out.println("Number call: " + obj.number); // Number call: 2

    }
}
