package com.think.javalevel1;

import java.util.Scanner;

public class DoWhileSimpleCalculater {
    // @formatter:on
    public static void main(String[] args) {
        Scanner spa = new Scanner(System.in);
        int nb1, nb2;
        char operator;

        do {
            System.out.println("Enter the first number: ");
            nb1 = spa.nextInt();
            System.out.println("Enter the second number: ");
            nb2 = spa.nextInt();

            System.out.println("Enter one of these operates: ");
            System.out.println("+ - * / %");
            System.out.println("Enter any key to quit");

            int res;
            operator = spa.next().charAt(0);
            switch (operator) {
                case '*':
                    res = nb1 * nb2;
                    System.out.println("Res" + " = " + res);
                    break;
                case '/':
                    res = nb1 / nb2;
                    System.out.println("Res" + " = " + res);
                    break;
                case '+':
                    res = nb1 + nb2;
                    System.out.println("Res" + " = " + res);
                    break;
                case '-':
                    res = nb1 - nb2;
                    System.out.println("Res" + " = " + res);
                    break;
                case '%':
                    res = nb1 % nb2;
                    System.out.println("Res" + " = " + res);
                    break;
                default:
                    System.out.println("You have entered a wrong operator");
                    break;
            }
        } while (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%');
    }
}
