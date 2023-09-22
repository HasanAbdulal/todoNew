package com.think.javaOOP.theInterface;

public class Main {
    static void interfaceMethod(SelfDrivable vehicle) {
        vehicle.drive();
    }

    public static void main(String[] args) {
        CarVerOne car = new CarVerOne();
        car.destination("New York");
        System.out.println("Car is at " + car.getX() + ", " + car.getY());
        Movable car2 = new CarVerOne(10, 10);

        // Not allowed to define an object of an interface
        // Only allowed to apply the polymorphism concept
        // Movable car3 = new Movable();


        SelfDrivable vehicle = new CarVerOne();
        vehicle.drive();
        vehicle = new CarVerTwo();
        vehicle.drive();
        // 
        interfaceMethod(new CarVerOne());
        interfaceMethod(new CarVerTwo());

        // List <Integer> list = new ArrayList<>();
        // To do the same think we need to use the generic interface
        GenericInterface<Car> carVerOneObj = new Car();
        // Car car = (Car) carVerOneObj.carModel();

    }
}
