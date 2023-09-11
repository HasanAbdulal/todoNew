package com.think.javaOOP.arrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 2, 4, 6, 1));

        // Contains method, returns boolean value
        // System.out.println(numbers.contains(3)); // true
        // System.out.println(numbers.contains(5)); // false

        // RetainAll method
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 21, 2, 63, 1, 1));
//        numbers2.retainAll(numbers);
        // numbers2.retainAll(Arrays.asList(1, 3, 2));
        numbers2.retainAll(Collections.singleton(3));
        System.out.println(numbers2); // [3, 1]

        // SubList method
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(34, 51, 2, 6, 1, 1));
        ArrayList<Integer> subList = new ArrayList<>(numbers3.subList(1, 6));
        System.out.println(subList); // [51, 2, 6,1,1]

        // isEmpty method & clear method
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(34, 51, 2, 6, 1, 1));
        System.out.println(numbers4.isEmpty()); // false
        numbers4.clear();
        System.out.println(numbers4.isEmpty()); // true

        // ensureCapacity method: increase the capacity of the ArrayList
        ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(34, 51, 2, 6, 1, 1));
        System.out.println(numbers5.size()); // 6
        numbers5.ensureCapacity(100); // increase the capacity to 100
        numbers5.trimToSize(); // trim the capacity to the current size

        // forEach method
        ArrayList<Integer> numbers6 = new ArrayList<>(Arrays.asList(4, 2, 65, 42, 5, 34, 51, 2, 6, 1, 1));
        // numbers6.forEach((n) -> System.out.print(n + "-"));

        // sort method
        ArrayList<Integer> numbers7 = new ArrayList<>(Arrays.asList(4, 2, 65, 42, 5, 34, 51, 2, 6, 3, 1));
        Collections.sort(numbers7); // sort in ascending order
        System.out.println(numbers7); // [1, 1, 2, 2, 4, 5, 6, 34, 42, 51, 65]
        // Collections.sort(numbers7, Collections.reverseOrder()); // sort in descending order
        numbers7.sort(Collections.reverseOrder()); // sort in descending order
        System.out.println(numbers7); // [65, 51, 42, 34, 6, 5, 4, 2, 2, 1, 1]

        Collections.reverse(numbers7); // reverse the order
        System.out.println(numbers7); // [1, 1, 2, 2, 4, 5, 6, 34, 42, 51, 65]

        // Max and Min methods
        System.out.println("Min Number: " + Collections.min(numbers7) + " ,Max number: " + Collections.max(numbers7)); // 1

        // Create a list of Distinct elements taken from the user
        ArrayList<Integer> numbers8 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the element: ");
            int num = scanner.nextInt();
            // if the number is not in the list, add it
            if (!numbers8.contains(num)) {
                numbers8.add(num);
            }
        }
        System.out.println(numbers8);
    }
}
