package com.think.javaOOP.ReturingObject;

public class ReObj {
    // 1.
    int val;

    // A. Create a constructor with no parameter
    public ReObj() {
    }

    // Constructor
    public ReObj(int val) {
        this.val = val;
    }

    // By adding the word static to the method, it can be called directly by the class name.
    /*static ReObj sum(ReObj obj1, ReObj obj2) { // 
        ReObj obj = new ReObj(); // B. Create a new object. It will look for a constructor with no parameter
        obj.val = obj1.val + obj2.val; // C. Addition of two objects, and assign the result to the new object
        return obj;
    }*/

    // Another way to construct the function sum()
    ReObj sum(ReObj obj2) {
        ReObj y = new ReObj();
        y.val = this.val + obj2.val;
        return y;
    }

}
