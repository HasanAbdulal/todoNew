package javaLevel1;

import java.util.Scanner;

public class SimpleCalculater {
    public static void main(String[] args) {
        //@formatter:on
        // Write a JAVA program to create a simple calculator to perform the following operations: +, -, *, /
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter one of the following operations: +, -, *, / :");

        char operation = calc.next().charAt(0);
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Invalid operator");
        } else {

            System.out.println("Enter the first number: ");
            float num1 = calc.nextFloat();

            System.out.println("Enter the second number: ");
            float num2 = calc.nextFloat();

            float result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The sum of the two numbers is: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("The difference of the two numbers is: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The product of the two numbers is: " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println("The division of the two numbers is: " + result);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
