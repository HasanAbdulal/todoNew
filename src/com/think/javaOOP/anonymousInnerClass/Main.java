package com.think.javaOOP.anonymousInnerClass;

public class Main {
    public interface Showable {
        public void print();
    }

    // Anonymous inner class as a class
    class annon implements Showable {
        @Override
        public void print() {
            System.out.println("Hello");
        }
    }

    // Anonymous inner class as argument
    static void display(Showable s) {
        s.print();
    }

    public static void main(String[] args) {
        // Will call the RewardClass from the class 
        RewardClass emp1 = new RewardClass();
        // emp1.rewardMethod();
        System.out.println(emp1.getClass().getName()); // com.think.javaOOP.anonymousInnerClass.RewardClass

        RewardClass emp2 = new RewardClass();
        // emp2.rewardMethod();

        // Anonymous inner class
        RewardClass emp3 = new RewardClass() {
            @Override
            public void rewardMethod() {
                System.out.println("My reward is 30 euro");
            }
        };
        emp3.rewardMethod();
        // System.out.println(emp3.getClass().getName()); // com.think.javaOOP.anonymousInnerClass.Main$1
        // If we want to call the method only once, we can use this syntax:
        /*new RewardClass() {
            @Override
            public void rewardMethod() {
                System.out.println("My reward is 30 euro");
            }
        }.rewardMethod();*/

        // Anonymous inner class with interface
        /*Showable s = new Showable() {
            @Override
            public void print(int a) {
                System.out.println("Hello " + a);
            }
        };
        s.print(12);*/

        // Lambda expression using when we have a single method in an interface
        /*Showable s1 = (e) -> {
            System.out.println("Hello " + e);
        };
        s1.print(17);*/

        // invoke the display() method by passing anonymous inner class as an argument
        display(new Showable() {
            @Override
            public void print() {
                System.out.println("Hello+++++ ");
            }
        });
    }
}
