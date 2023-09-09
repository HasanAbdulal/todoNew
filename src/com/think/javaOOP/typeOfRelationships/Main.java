package com.think.javaOOP.typeOfRelationships;

public class Main {
    public static void main(String[] args) {
        // Aggregation relationship, because the Department class object can exist without the Employee class object
        Department department = new Department("IT", 1);
        // If the Employee class object is destroyed, the Department class object will not be destroyed
        Employee employee = new Employee(1, 1000, "John", "Doe", "Smith", "O+", "US123456789", "American", 1990,
            department);

        System.out.println(employee);
    }
}
