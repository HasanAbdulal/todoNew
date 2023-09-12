package com.think.javaOOP.abstractClass;

public class Main {
    static void testCar(Car car) {
        car.autoPilot();
        car.parkingSensor();
        car.streamingServices();
    }

    public static void main(String[] args) {
        Car car = new SUV(1.5f, 2.5f, 4);
//        testCar(new SUV(1.5f, 2.5f, 4));
        testCar(car);
        car = new Hatchback();
        testCar(car);
    }
}
