package com.think.javaOOP.javaEnums3;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    enum Permission {
        READ,
        WRITE,
        EXECUTE
    }

    public static void main(String[] args) {

        EnumMap<WeekDays, String> map = new EnumMap<WeekDays, String>(WeekDays.class);
        map.put(WeekDays.MONDAY, "Working day");

        /* --------------------------------------- */
        EnumSet<WeekDays> days = EnumSet.allOf(WeekDays.class);
        System.out.println(days);

        EnumSet<WeekDays> days2 = EnumSet.noneOf(WeekDays.class);
        System.out.println(days2);

        EnumSet<WeekDays> days3 = EnumSet.of(WeekDays.MONDAY);
        System.out.println(
            days3.contains(WeekDays.MONDAY)
        );
        EnumSet<WeekDays> days4 = EnumSet.range(WeekDays.MONDAY, WeekDays.FRIDAY);
        System.out.println(days4);

        EnumSet<WeekDays> days5 = EnumSet.complementOf(days4);
        System.out.println(days5);

        /* --------------------------------------- */
        EnumSet<WeekDays> businessDays = EnumSet.of(WeekDays.MONDAY, WeekDays.TUESDAY, WeekDays.FRIDAY);
        /* --------------------------------------- */
        EnumMap<Permission, Boolean> userPermissions = new EnumMap<>(Permission.class);

        userPermissions.put(Permission.READ, true);
        userPermissions.put(Permission.WRITE, false);
        userPermissions.put(Permission.EXECUTE, false);
    }
}
