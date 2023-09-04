package com.think.javaOOP;

public class Car {
    // Attributes
    // Use the keyword private to hide the data from other classes
    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    // Setters / Mutators
    // Use the keyword public to access the data from other classes
    public void setName(String nom) {
        name = nom;
    }

    // Getters / Accessors
    public String getName() {
        return name;
    }

    public void setModel(int mod) {
        if (mod >= 2019)
            model = mod; // We give the value of mod to model not the opposite
        else
            System.out.println("The model must be greater than 2019");
    }

    public int getModel() {
        return model;
    }
    /*Encapsulation mechanism is used to protect the data from others.
     * Encapsulation in java is a process of wrapping code and data together into a single unit,
     * for example, a capsule
     * We can create a fully encapsulated class in java by making all the data members of the class private.
     * To achieve encapsulation in java:
     * 1. Declare the variables of a class as private.
     * 2. Provide public setter and getter methods to modify and view the variable values.
     */

}
