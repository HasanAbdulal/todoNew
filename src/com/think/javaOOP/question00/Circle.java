package com.think.javaOOP.question00;

/*
 * Write a Java program to calculate the area and perimeter of a circle.
 * */
public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    // Parameter has the same name as the field
    // this.radius refers to the field radius and radius after the equal refers to the parameter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
            "radius=" + radius +
            ", color='" + color + '\'' +
            '}';
    }
}
