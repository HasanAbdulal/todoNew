package com.think.javaOOP.theInterface;

public class CarVerTwo implements Movable, SelfDrivable {
    private int x, y;
    private int numOfPassengers;

    public CarVerTwo() {
    }

    public CarVerTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void destination(String dest) {

    }

    @Override
    public void drive() {
        System.out.println("Driving vehicle V2..");
    }
}
