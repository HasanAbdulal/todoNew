package com.think.javalevel1;

public class Array2D {
    public static void main(String[] args) {
        // Hard Method illustrating 2D array
//        int[][] arr = new int[3][4];
        int[][] arr2 = new int[3][]; // 3 rows, but columns are not defined
        // Declaration of columns for each row
        arr2[0] = new int[4]; // 4 columns for row 0
        arr2[1] = new int[5]; // 5 columns for row 1
        arr2[2] = new int[6]; // 6 columns for row 2

        // Initialize the array
        arr2[0][0] = 43;
        arr2[0][1] = 12;
        arr2[0][2] = 65;
        arr2[0][3] = 32;

        arr2[1][0] = 21;
        arr2[1][1] = 32;
        arr2[1][2] = 21;
        arr2[1][3] = 43;
        arr2[1][4] = 54;

        arr2[2][0] = 32;
        arr2[2][1] = 54;
        arr2[2][2] = 65;
        arr2[2][3] = 76;
        arr2[2][4] = 87;
        arr2[2][5] = 98;
        /*System.out.println(arr2[0][0]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[2][0]);*/


        // Easy Method illustrating 2D array
        int[][] arr = {
            {43, 12, 65, 32},
            {21, 32, 21, 43, 54},
            {32, 54, 65, 76, 87, 98}
        };
        int[][] arr3 = new int[][]{
            {7, 2, 50, 22},
            {21, 32},
            {3, 4, 5, 6, 7, 9}
        };
//        System.out.println("Arr3 " + arr3[2].length); // We have 6 columns in row 2
        /*for (int i = 0; i < arr3[1].length; i++) {
            System.out.print(arr3[1][i] + " ");
        }*/ // 21 32

        // Print the array using for loop 
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }
        // Enhanced for loop
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
