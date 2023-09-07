package com.think.javaOOP.ReturingObject;

public class MathObj {
    int val1, val2;

    public MathObj() {
    }

    public MathObj(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    MathObj sumFunc(MathObj obj) {
        MathObj newObj = new MathObj();
        newObj.val1 = this.val1 + obj.val1;
        newObj.val2 = this.val2 + obj.val2;
        return newObj;
    }

}
