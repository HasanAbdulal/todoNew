package com.think.javaOOP;

public class Main {

    public static void main(String[] args) {
        /* Reserving a space in the memory for that object by using 'new' keyword
        // The Java runtime system is responsible for managing the memory that is used by objects.
        // When an object is no longer needed,
        // the runtime system will free up the memory that was reserved for that object.
        */
//        Car obj = new Car();
        // obj.name = "Mercedes"; // These attributes are private, so we can't access them from other classes
        // obj.maxSpeed = 280; // This is the proper technique to prevent attributes from changing outside of the 
        // class, package, and methods that access them.

        // obj.price = 159000;
        // obj.model = 2024;
        /*System.out.println("Car name: " + obj.name + "\n" +
            "Car max speed: " + obj.maxSpeed + "\n" +
            "Car price: " + obj.price + "\n" +
            "Car model: " + obj.model + "\n"
        );*/

        // Using the methods to access the instance variables,  
        // This is the correct mechanism for calling the methods that access the instance variables.
        Car ca = new Car();
        ca.setName("BMW");
        System.out.println("Car name: " + ca.getName() + "\n");

        Car ca0 = new Car();
        ca0.setModel(2018);
//        ca0.model = 2019; // This is not the right way to access the instance variables
        System.out.println("Car model: " + ca0.getModel() + "\n");
    }
}
