package com.think.javaOOP.polymorphism;

public class Main {

    public static void main(String[] args) {
        // Use a different object to call the method getSalary() from all classes
            /*Employee employees = new Employee("Real", "Liege", "IT", "real@gmail.com", 1700);
            System.out.println("SalarieEmployee E1: " + employees.getSalary()); // 1300*/
    
            /*SalarieEmployee salarieEmployee = new SalarieEmployee("Real", "Liege", "IT", "real@gmail.com", 1700, 230);
            System.out.println("SalarieEmployee E2: " + salarieEmployee.getSalary()); // 1530
    
            DailyEmployee dailyEmployee = new DailyEmployee("Real", "Liege", "IT", "real@gmail.com", 0, 20, 12);
            System.out.println("DailyEmployee E3: " + dailyEmployee.getSalary()); // 240
    
            HourlyEmployee hourlyEmployee = new HourlyEmployee("Real", "Liege", "IT", "real@gmail.com", 0, 20, 45);
            System.out.println("HourlyEmployee E4: " + hourlyEmployee.getSalary()); // 900*/

        // Use the same object to call the method getSalary() from Employee class
            /*employees = new SalarieEmployee("Real", "Liege", "IT", "real@gmail.com", 1700, 230);
            System.out.println("SalarieEmployee E2: " + employees.getSalary()); // 1530
    
            employees = new DailyEmployee("Real", "Liege", "IT", "real@gmail.com", 0, 20, 12);
            System.out.println("DailyEmployee E3: " + employees.getSalary()); // 240
    
            employees = new HourlyEmployee("Real", "Liege", "IT", "real@gmail.com", 0, 20, 45);
            System.out.println("HourlyEmployee E4: " + employees.getSalary()); // 900*/


        // Can we override from a static method? No, we can't
        // When we use the polymorphism concept, we can't override from a static method
        /*Employee e1 = new SalarieEmployee();
        e1.print();*/ // Employee-Base-Class

        // But if I use two different objects, I can call the static method
        Employee e1 = new Employee();
        e1.print();
        SalarieEmployee e2 = new SalarieEmployee();
        e2.print();
        // In this case, we didn't use the polymorphism concept, we just use two different objects

    }
}
