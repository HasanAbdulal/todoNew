package com.think.javaOOP.ReturingObject;

public class ComparingObj {
    int val;

    public ComparingObj(int val) {
        this.val = val;
    }

    boolean equals(ComparingObj obj) {
        if (this.val <= obj.val) {
            return true;
        } else {
            return false;
        }
    }
}
