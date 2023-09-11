package com.think.javaOOP.arrayList3;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Create a menu program with the following options:
 * 1. Add element
 * 2. Remove element
 * 3. Print list
 * 4. Exit
 * The program should be able to handle exceptions.
 * The program will remain running until the user chooses to exit.
 * */
public class Main {
    static void displayMenu() {
        System.out.println("Choose an option: ");
        System.out.println(
            "1. Add element \n" +
                "2. Remove element \n" +
                "3. Print list \n" +
                "4. Exit \n"
        );
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter an integer number: ");
                    list.add(scanner.nextInt());
                    System.out.println("Element added successfully!");
                    break;
                case 2:
                    System.out.println("Enter the number you want to remove: ");
                    // Restocking the scanner object, to check if the number is already in the list or not
                    int element = scanner.nextInt();
                    if (list.contains(element)) {
                        list.remove((Integer) element); // Because we want to remove the element, not the index, so we 
                        // have to cast it to Integer, otherwise it will be considered as an index
                        System.out.println("Element removed successfully!");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;
                case 3:
                    System.out.println("List: " + list);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    return;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
