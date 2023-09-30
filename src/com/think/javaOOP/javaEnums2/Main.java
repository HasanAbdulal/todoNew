package com.think.javaOOP.javaEnums2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    enum WeekDays {
        MONDAY, TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }


    public static void main(String[] args) {
        Order order = new Order();
        order.setStatus(Order.OrderStatus.DELIVERED);
        System.out.println(order.isDelivered());

        // The ordinal() method returns the position of an enum constant
        System.out.println(WeekDays.MONDAY.ordinal()); // 0
        // The compareTo() method compares the enum constants based on their ordinal
        System.out.println(WeekDays.SUNDAY.compareTo(WeekDays.WEDNESDAY)); // 6
        // The toString() method returns the string representation of the enum constants.
        System.out.println(WeekDays.MONDAY.toString() == "MONDAY"); // true
        // The name() method returns the defined name of an enum constant in string form.
        // The returned value from the name() method is final.
        System.out.println(WeekDays.MONDAY.name() == "MONDAY"); // true
        // The valueOf () method takes a string and returns an enum constant having the same string
        System.out.println(WeekDays.valueOf("MONDAY")); // MONDAY
        // The values() method returns an array of enum type containing all the enum constants.
        for (WeekDays day : WeekDays.values()) {
            System.out.print(day); // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        System.out.println(Arrays.toString(WeekDays.values()));
    }
}
