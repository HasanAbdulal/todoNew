package com.think.javalevel1;

public class ForLoop {
    public static void main(String[] args) {
        /*for (int i = 0; i < 12 && i % 2 == 0; i++) {
            System.out.println("Hello World " + i);
        } // 0
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                System.out.println("Hello World " + i);
            }
        } // 0 2 4 6 8 10
        // || or
        for (int i = 0, j = 0; (i < 10) || (j < 5); i++, j++) {
            System.out.println("i = " + i + "\t" + "j = " + j);
        } // 0 0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 9
        // && and
        for (int i = 0, j = 0; (i < 10) && (j < 5); i++, j++) {
            System.out.println("\n" + "i = " + i + "\t" + "j = " + j);
        } // 0 0 1 1 2 2 3 3 4 4*/

        // i 0 ->5 && j 5 -> 0
        for (int i = 0, j = 5; i < 10 && j >= 0; i++, j--) {
            System.out.println("i = " + i + "\t" + "j = " + j);
        } // 0 1 2 3 4 5 5 4 3 2 1 0

    }
}
