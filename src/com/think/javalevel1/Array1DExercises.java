package com.think.javalevel1;

import java.util.Arrays;
//import java.util.Scanner;

public class Array1DExercises {
    public static void main(String[] args) {
        // 1. Write a program to sum all the values of a given Array
        /*int[] myArray = {1, 4, 10, 22, 46, 94, 190, 382};
        int sum = 0;
        // For loop
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("The sum of the array is: " + sum);
        // Foreach loop
        int a = 0;
        for (int j : myArray) { // j < myArray.length
            a += j;
        }
        System.out.println("The sum of the array is: " + a);*/

        // 2. Write a program to calculate the average of the values of a given Array
        /*int[] arr = {3, 4, 5, 95, 43, 54, -2, -89};
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += (double) arr[i] / arr.length;
        }
        System.out.println("The average of the array is: " + avg);*/

        // 3. Write a program to calculate the average of the values of a given Array by the user
        /*Scanner input = new Scanner(System.in);
        int[] arr0 = new int[5];
        int sum0 = 0;
        double avg0 = 0;

        for (int i = 0; i < arr0.length; i++) {
            System.out.println("Enter a number: " + (i + 1) + " : ");
            arr0[i] = input.nextInt();
            sum0 += arr0[i];
        }
        avg0 += (double) sum0 / arr0.length;
        System.out.println("The average of the array is: " + avg0);*/

        // 4. Write a Java program to test if an array contains a specific value 
        /*int[] arr1 = {34, 74, 35, 5, 3, 4, -5, -49};
        int num1 = 5;
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num1) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("The array contains this number: " + num1);
        } else {
            System.out.println("The array doesn't contain this number: " + num1);
        }*/

        // 5. Write a Java program to find the maximum and minimum value of an array.
        /*int[] arr2 = {64, 43, 23, 44, 324, 346, -3, -34};
        int max = arr2[0]; // We should suppose the first element of the array is the maximum
        int min = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            } else {
                min = arr2[i];
            }
        }
        System.out.println("The minimum value of the array is: " + max);
        System.out.println("The maximum value of the array is: " + min);*/

        // 6. Write a Java program to sort an array in ascending and descending order.
        int[] arr3 = {34, 56, 9, 2, 657, 4, 52, -2, 58, 0, -13};
        Arrays.sort(arr3);
        System.out.println("The array in ascending order is: " + Arrays.toString(arr3));
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i] + " ");
        }
    }
}
