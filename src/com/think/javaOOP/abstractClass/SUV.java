package com.think.javaOOP.abstractClass;

public class SUV extends Car {
    public SUV(float height, float width, int numberOfWheels) {
        super(height, width, numberOfWheels);
    }

    @Override
    void autoPilot() {
        System.out.println("SUV autoPilot");
    }

    @Override
    void streamingServices() {
        System.out.println("SUV streamingServices");
    }

    @Override
    void parkingSensor() {
        System.out.println("SUV parkingSensor");
    }
}
