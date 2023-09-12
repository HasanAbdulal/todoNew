package com.think.javaOOP.abstractClass;

public abstract class Car {
    float height;
    float width;
    int numberOfWheels;

    abstract void autoPilot();

    abstract void streamingServices();

    abstract void parkingSensor();

    public Car() {
    }

    public Car(float height, float width, int numberOfWheels) {
        this.height = height;
        this.width = width;
        this.numberOfWheels = numberOfWheels;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
