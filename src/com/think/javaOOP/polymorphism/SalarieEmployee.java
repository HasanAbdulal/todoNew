package com.think.javaOOP.polymorphism;

public class SalarieEmployee extends Employee {
    float bouns;

    public SalarieEmployee(String name, String address, String department, String email, int salary, float bouns) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }

    // Method overriding come from Employee class
    @Override
    public float getSalary() {
        return super.getSalary() + bouns;
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }

    // Constructor
    public SalarieEmployee() {
    }

    // To test the polymorphism concept
    public static void print() {
        System.out.println("SalarieEmployee-Sub-Class");
    }
}
