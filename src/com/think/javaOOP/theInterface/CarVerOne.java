package com.think.javaOOP.theInterface;

public class CarVerOne implements Movable, SelfDrivable {
    private int x, y;
    private int numOfPassengers;

    public CarVerOne() {
    }

    public CarVerOne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void destination(String dest) {
        System.out.println("Going to " + dest);
    }

    @Override
    public void drive() {
        System.out.println("Driving vehicle V1...");
    }

    public String getX() {
        return Integer.toString(x);
    }

    public String getY() {
        return Integer.toString(y);
    }
}