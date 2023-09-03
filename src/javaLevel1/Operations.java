package javaLevel1;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner opera = new Scanner(System.in);

        int num;
        System.out.println("Enter a number: ");
        // Check if the number is even or odd
        num = opera.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
            if (num > 12) {
                System.out.println("The number is greater than 12");
            } else if (num == 12) {
                System.out.println("The number is egal to 12");
            } else {
                System.out.println("The number is less than 12");
            }
        } else {
            System.out.println("The number is odd");
        }

    }
}
