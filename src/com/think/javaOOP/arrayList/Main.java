package com.think.javaOOP.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        System.out.println("Using the method get(): " + numbers.get(0)); // 0
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

        // Change the value of the first element in the new list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.set(0, 10);
        System.out.println("Change the value of first index: " + list); // [10, 2, 3, 4, 5]

        // The methods to removing elements from the ArrayList
        /*
         * remove(index)
         * remove(object)
         * remove(element)
         * removeAll()
         * clear()
         * removeIf()
         * retainAll()
         */
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 56, 34, 13, 355));
        // list2.removeRange(1, 3); // remove elements from index 1 to index 3, but the method is protected
        list2.removeIf(n -> (n % 2 == 0)); // remove all even numbers

        // list2.remove(4); // remove the element at index 4
        // list2.remove(4); // Error: IndexOutOfBoundsException
        // list2.remove(Integer.valueOf(34)); // remove element 34 by the method valueOf()
        // list2.remove(new Integer(10)); // remove element 10 by creating a new object
        // list2.remove((Integer) 56); // remove element 56 by casting
        System.out.println(list2); // [10, 56, 34, 43]

        ArrayList<String> str = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "B", "C"));
        // str.removeAll(Arrays.asList("A")); // remove all elements "A", can remove one or more elements
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        // str.removeAll(str2); // remove all elements of the list str2
        str.removeAll(Collections.singleton("A")); // remove all elements "A"
        System.out.println(str);

        // Polymorphic ArrayList
        Object[] obj = new Object[5];
        obj[0] = 1;
        obj[1] = "A";
        obj[2] = 3.14;
        obj[3] = true;
        obj[4] = 'A';
        System.out.println(Arrays.toString(obj));
    }
}
