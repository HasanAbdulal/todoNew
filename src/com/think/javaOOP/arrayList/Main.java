package com.think.javaOOP.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Static array
        // dataType[] arrayName = new dataType[arraySize];

        // Dynamic array
        /*
         * ArrayList is a class in java.util package
         * It has no fixed size (limit size)
         * It can store any data type
         * We can add or remove elements anytime
         * It can dy dynamically grow and shrink in size after addition or removal of elements
         * */
        /*
         * To use primitive types, such as int, float, double ..., we must specify an equivalent wrapper class
         * int -> Integer
         * float -> Float
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         * */
        // ArrayList is a generic class with a type parameter :
        // By adding <T> 'Type' or <E> 'Element' to the class name, we can create a generic class
        // ArrayList<T> or ArrayList<E>
        // T or E is a type parameter
        // The E - Element is used extensively by the Java Collections Framework to define the type of objects stored in a collection
        // Example: ArrayList<E> 2 - 'A' - "REd" - true - 3.14
        /*
         *   public class Employee {
         * }
         * ArrayList<Employee> employees = new ArrayList<Employee>();
         */
        // Syntax
        // ArrayList<dataType> arrayName = new ArrayList<dataType>();
        // ArrayList<dataType> arrayName = new ArrayList<>();
        // ArrayList<dataType> arrayName = new ArrayList<dataType>(arraySize);

        // Exercise
        // Create an ArrayList of type Integer with 5 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
//        int sout = numbers.size();
        /*for (int i = 0; i < sout; i++) {
            System.out.println(numbers.get(i));
        }*/
        /*for (Integer number : numbers) {
            System.out.println(number);
        }*/
        // Add a new number to the ArrayList: add(index, element)
        // numbers.add(0, 5);

        // Add at the end of the ArrayList: add(index = numbers.size() ,element)
        /*numbers.add(numbers.size(), 6);
        System.out.println(numbers);*/

        // When we want to add an element from the ArrayList to another ArrayList, we can use the addAll() method
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(9);

//        numbers2.addAll(numbers);
//        System.out.println(numbers2); // [9, 0, 1, 2]
        // Add multiple elements to the ArrayList 'numbers2' Without accreditation of the ArrayList 'numbers'
        numbers2.addAll(Arrays.asList(3, 4, 5, 6, 7, 8));
        System.out.println(numbers2); // [9, 3, 4, 5, 6, 7, 8]

        // Add a multiple elements starting from a specific index
        numbers2.addAll(1, Arrays.asList(10, 11, 12));
        System.out.println(numbers2); // [9, 10, 11, 12, 3, 4, 5, 6, 7, 8]

        // Invoke a copy constructor
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(15, 23, 32, 45, 50));
        System.out.println(numbers3); // [1, 2, 3, 4, 5]

        // Clone method : clone() method is used to create a shallow copy of the list (clone() method is a protected method)
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(21, 25, 3, 4, 5));
        ArrayList numbers5;
        // Reference copy, which means that the changes made to the new list will be reflected in the original list
        numbers5 = (ArrayList) numbers4.clone();
        System.out.println(numbers5); // [21, 25, 3, 4, 5]
    }
}
