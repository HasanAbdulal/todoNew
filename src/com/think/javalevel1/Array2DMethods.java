package com.think.javalevel1;

public class Array2DMethods {
    // 1. Print 2D array
    static void print2DArray(int[][] arr) {
        // Print the array using for loop 
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // arr[0].length
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // 2. Get sum of 2D array
    static int sum2DArray(int[][] arr) {
        int sum = 0;
        // Print the array using for loop 
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // arr[0].length
                sum += arr[row][col];
            }
        }
        return sum;
    }

    // 3. Get sum of a row
    static int getSumOfRow(int[][] arr, int row) {
        int sum = 0;
        for (int col = 0; col < arr[row].length; col++) {
            sum += arr[row][col];
        }
        return sum;
    }

    //
    static int[][] getArr() {
        int[][] ar = new int[3][];
        return ar;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {43, 12, 65, 32},
            {2, 2, 2, 3, 4},
            {32, 54, 65, 76, 87, 98}
        };
        // 1. Print 2D array
        print2DArray(arr);
        // 2. Get sum of 2D array
        System.out.println("Sum of 2D array is " + sum2DArray(arr));

        // 3. Get sum of a row
        int row = 1;
        System.out.println("Sum of row " + row + " is " + getSumOfRow(arr, row));

        System.out.println("hee" + getArr());
    }
}
