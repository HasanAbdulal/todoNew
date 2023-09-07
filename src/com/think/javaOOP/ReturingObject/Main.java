package com.think.javaOOP.ReturingObject;

public class Main {
    // Calculate the sum of two 'primitive data type' variables 
    static int sumTwoVar(int a, int b) {
        int c = a + b;
        return c;
    }

    // Calculate the sum of two 'object'

    public static void main(String[] args) {
        // 1.
        /*int result = sumTwoVar(1, 2);
        System.out.println("Result: " + result);*/
        // 2.
        ReObj obj1 = new ReObj(7);
        ReObj obj2 = new ReObj(2);
        // ReObj obj1 = obj + obj0; // Error: operator '+' cannot be applied to ReObj
        ReObj obj4 = new ReObj(); // Method indirect call by creating a new object obj4
        // ReObj obj3 = obj4.sum(obj1, obj2);

        // Because the method sum() is static, it can be called directly by the class name.
//        ReObj obj3 = ReObj.sum(obj1, obj2);
//        System.out.println("Result: " + obj3.val);

        // Another way to construct the function sum()
        // The obj2, it will invoke the method sum() in the class ReObj
        ReObj obj5 = obj1.sum(obj2);
        System.out.println("Result: " + obj5.val);


        MathObj obj6 = new MathObj();
        obj6.val1 = 1;
        obj6.val2 = 2;
        MathObj obj7 = new MathObj(4, 5);
        MathObj obj8 = obj6.sumFunc(obj7); // obj8.val1 = obj6 + obj7 == 1 + 4 || obj8.val2 = obj6 + obj7 == 2 + 5
        System.out.println("Result: " + obj8.val1 + " " + obj8.val2);

        // Comparing two objects
        ComparingObj obj9 = new ComparingObj(1);
        ComparingObj obj10 = new ComparingObj(3);

        /*obj9 = obj10; // By combining these two addresses, they become the same.
        if (obj9.equals(obj10)) {
            System.out.println("obj9 == obj10"); // 
        } else {
            System.out.println("obj9 != obj10"); // When comparing two objects by reference, the result is false
            // obj9 == obj10 is false, because they are two different objects referring to two different memory 
            // addresses
        }*/
        // Compare two objects by value
        obj9.equals(obj10);
        System.out.println("Is obj9 == obj10? : " + obj9.equals(obj10));

    }
}
