//import java.util.InputMismatchException;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        //1. Write a program that prints the numbers from 1 to 10.
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }*/
        //2. While loop
        /*int i = 1;
        while (i <= 10) {
            System.out.println("i While = " + i);
            i++;
        }*/
        //3. Do While loop
        /*i = 1;
        do {
            System.out.println("i Do While = " + i);
            i++;
        } while (i <= 10);*/

        //4. Write a program that calculates the sum of 10 floating point numbers, using a for loop.
        /*double sum = 0;
        for (float k = 1; k <= 10; k++) {
            sum += k;
        }
        System.out.println("Sum = " + sum);*/
        //5. The same program but this time we ask the user to enter the number of numbers to sum.
        Scanner numb = new Scanner(System.in);
        /*float sum2 = 0, nb;

        for (int k = 1; k <= 4; k++) {
            System.out.println("Enter a number (use ',' as a decimal separator):");
            if (numb.hasNextFloat()) {
                nb = numb.nextFloat();
                sum2 += nb;
            } else {
                System.out.println("Please enter a valid number!");
                numb.nextLine(); // Clear the invalid input
                k--; // Decrement k to repeat the loop
            }
        }
        System.out.println("You're sum = " + sum2);*/

        /* 6.
         * Write a program that asking the user to input a positive integer.
         * It should then print the multiplication table of that number.
         */
        /*int number;
        do {
            System.out.println("Enter a positive integer:");
            while (!numb.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                numb.nextLine(); // Clear the invalid input
            }
            number = numb.nextInt();
        } while (number <= 0);

        System.out.println("Multiplication table of :" + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }*/

        /* 7. Write a program to find the factorial value of any number entered through the user.
         * Ex: Factorial of !5 = 5*4*3*2*1 = 120
         * If the user enters a negative number, the program should tell the user that the entry is incorrect
         * and ask the user to enter a positive number.
         * */
        /*int nbFact = 1, n = 1;
        do {
            try {
                System.out.println("Enter a positive number:");
                n = numb.nextInt();

                if (n <= 0) {  // 1. Check for positive number
                    System.out.println("Please enter a positive number!");
                }

            } catch (InputMismatchException e) {  // 2. Handle the exception
                System.out.println("Please enter a number!");
                numb.nextLine(); // Clear the invalid input
            }
        } while (n <= 0);  // 3. Loop until a positive number is entered

        for (int i = n; i >= 1; i--) {
            nbFact *= i;
        }
        System.out.println("Factorial of " + n + " = " + nbFact);*/

        //8. Write a program that enters 10 integers from the user, and then prints the sum of the odd and even 
        // integers.
        // The floating point numbers are not allowed.
        /*int sumEven = 0, sumOdd = 0, nb;
        System.out.println("Enter 10 integers :");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Enter integer " + i + ":");
            nb = numb.nextInt();
            if (nb % 2 == 0) {
                sumEven += nb;
            } else {
                sumOdd += nb;
            }
        }
        System.out.println("Sum of even numbers = " + sumEven);
        System.out.println("Sum of odd numbers = " + sumOdd);*/

        //9. The same as the previous program but this time we ask the user to prints the number of the even and the 
        // odd.
        // If I enter 7 even numbers and 3 odd numbers, the program should print 7 even numbers and 3 odd numbers.
        /*int sumEven = 0, sumOdd = 0, countEven = 0, countOdd = 0, nb = 0;
        System.out.println("Enter 10 integers :");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Enter integer " + i + ":");
            nb = numb.nextInt();
            if (nb % 2 == 0) {
                sumEven += nb;
                countEven++;
            } else {
                sumOdd += nb;
                countOdd++;
            }
        }
        System.out.println("Sum and total of even numbers = " + countEven + " (" + sumEven + ")");
        System.out.println("Sum and total of odd numbers = " + countOdd + " (" + sumOdd + ")");*/

        //10. Write a program to calculate the sum of the following series where n is input by the user.
        // 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
        float sum = 0;
        int n;
        System.out.println("Enter a positive integer:");
        n = numb.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += (float) (1.0 / i); // Casting to float
        }
        System.out.println("Sum = " + sum);
    }
}