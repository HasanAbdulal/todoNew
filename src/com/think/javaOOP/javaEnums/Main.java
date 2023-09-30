package com.think.javaOOP.javaEnums;

public class Main {
    interface NewNewInterface {
    }

    enum WeekDays implements NewNewInterface {
        /*MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY("Weekend"),*/ SUNDAY("Weekend") {
            @Override
            public void doSomething() {
                System.out.println("Do something");
            }
        };
        private String description;

        WeekDays() {
            this.description = "Working day";
        }

        WeekDays(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public abstract void doSomething();
    }

    public static void main(String[] args) {
        Numbers num = Numbers.ONE;
        int val = 1;
        switch (num) {
            case ONE:
                System.out.println("ONE");
                break;
            case TWO:
                System.out.println("TWO");
                break;
            default:
                System.out.println("THREE");
        }

        System.out.println(WeekDays.SUNDAY.getDescription()); // Weekend
        WeekDays.SUNDAY.doSomething(); // Do something

    }
}
