package com.think.javaOOP.question00;

public class Main {
    public static void main(String[] args) {
        Circle circ = new Circle(), circ2 = new Circle();
        circ.setRadius(3.0);
        circ.setColor("Red");
        circ.getArea();
        System.out.println("Circle Area: " + circ.getArea());

        circ2.setRadius(2.0);
        circ2.setColor("Blue");
        circ2.getCircumference();
        System.out.println("Circle Circumference: " + circ2.getCircumference());
    }
}
