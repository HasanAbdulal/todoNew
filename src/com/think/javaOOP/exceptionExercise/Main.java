package com.think.javaOOP.exceptionExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ThinkBank thinkBank = new ThinkBank();
            String input = "";
            do {
                System.out.println("Enter your choice: ");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrow");
                System.out.println("3. Balance Enquiry");
                System.out.println("4. Exit");
                input = scanner.next();

                switch (input) {
                    case "1":
                        System.out.println("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        thinkBank.deposit(amount);
                        thinkBank.balanceEnquiry();
                        break;
                    case "2":
                        System.out.println("Enter amount to withdraw: ");
                        amount = scanner.nextDouble();
                        thinkBank.withdraw(amount);
                        thinkBank.balanceEnquiry();
                        break;
                    case "3":
                        thinkBank.balanceEnquiry();
                        break;
                    case "4":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                System.out.println("Do you want to continue? (y/n)");
                input = scanner.next();
            } while (input.equalsIgnoreCase("y"));

        } catch (InvalidAmountException | InsufficientFundsException | NumberFormatException |
                 InputMismatchException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
