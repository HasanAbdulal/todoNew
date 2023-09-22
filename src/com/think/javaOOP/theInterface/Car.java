package com.think.javaOOP.theInterface;

public class Car<T> implements GenericInterface<T> {
    @Override
    public T carModel() {
        return (T) new CarVerOne();
    }
}
