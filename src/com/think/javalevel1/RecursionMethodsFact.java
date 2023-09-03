package com.think.javalevel1;

public class RecursionMethodsFact {
    static int fact(int n) { // 5! = 5 * 4 * 3 * 2 * 1 = 120 => 1! = 1
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    // 32 / 2 = 16 / 2 = 8 / 2 = 4 / 2 = 2 / 2 = 1
    // 2 ^ 5 = 32
    // 2 ^ 10 = 1024
    // This method will return the power of 2
    static int fun(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + fun(n / 2);
        }
    }

    // Print the numbers from 1 to 5
    static void print(int n) {
        if (n < 1) { // The smallest recursive we can have is 1
            return;
        } else {
            // print(n - 1); // In this place the method will print the numbers from 1 to 5
            // print(4) recall the method print
            System.out.println("n #" + n);
        }
        print(n - 1); // This is the recursive call, it will print the numbers from 5 to 1
    }

    public static void main(String[] args) {
        System.out.println("Factorial : " + fact(1)); // output: 1
        System.out.println("Fun : " + fun(1024)); // output: 10
        print(5); // output: 5 4 3 2 1 or 1 2 3 4 5 depends on the order of the print statement
    }
}
