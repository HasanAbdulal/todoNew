package com.think.javalevel1;

public class Overloading {
    /*
     * javaLevel1.Overloading is a feature that allows a class to have more than one method with the same name,
     * but with different parameters (argument/signatures lists are different), where the signature can differ by
     * number of input parameters or type of input parameters or both.
     * javaLevel1.Overloading is related to compile-time (or static) polymorphism.
     * */
    // Return is int, and signature is sum(int, int)
    static int sum(int a, int b) {
        return a + b;
    }

    // Return is float, and signature is sum(float, float)
    static float sum(float a, float b) {
        return a + b;
    }

    // Return is float, and signature is sum(int, int). sum(int, int) is already defined, which is not allowed.
    /*static float sum(int a, int b) {
        return a + b;
    }*/

    // Ruturn is float, and signature is sum(int, float)
    static float sum(int a, float b) {
        return a + b;
    }

    // Ruturn is float, and signature is sum(long, int)
    static float sum(long a, int b) {
        return a + b;
    }

    // Exemple of overloading:
    static float order(float totalPrice) {
        return totalPrice;
    }

    static float order(float totalPrice, float discount) {
        return totalPrice - discount;
    }

    static float order(float totalPrice, float discount, int deliveryCharge) {
        return (totalPrice - discount) + deliveryCharge;
    }

    static float order(float totalPrice, int deliveryCharge, String couponCode) {
        return (totalPrice + deliveryCharge) - 2;
    }

    public static void main(String[] args) {
        float totalPrice = 29.3f;
        int deliveryCharge = 3;
        System.out.println("The total price is : " + totalPrice + " ,and for the delivery charge is : " + deliveryCharge);
        System.out.println("Meal price = " + order(totalPrice, deliveryCharge) + " €");

        System.out.println("Total meal price = " + order(totalPrice, deliveryCharge, "WELCOME") + " €");
    }
}
