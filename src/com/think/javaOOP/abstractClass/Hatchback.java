package com.think.javaOOP.abstractClass;

public class Hatchback extends Car {
    @Override
    void autoPilot() {
        System.out.println("Hatchback autoPilot");
    }

    @Override
    void streamingServices() {
        System.out.println("Hatchback streamingServices");
    }

    @Override
    void parkingSensor() {
        System.out.println("Hatchback parkingSensor");
    }
}
