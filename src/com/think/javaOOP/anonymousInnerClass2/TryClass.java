package com.think.javaOOP.anonymousInnerClass2;

public class TryClass {
    // Empty Constructor 
    public TryClass() {
        System.out.println("Empty Constructor called");
    }

    public TryClass(int x) {
        System.out.println("Param Constructor called");
    }

    public void tryMethod() {
        System.out.println("TryClass called");
    }

    // To access the variable x without using the keyword var in the anonymous inner class, we need use this technique instead.
    /*public void tryMethod2() {
        System.out.println("try Method 2");
    }*/
}
