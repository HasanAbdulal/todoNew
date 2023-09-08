package com.think.javaOOP.polymorphism;

public class DailyEmployee extends Employee {
    private float workDaysPrice;
    private int dailyRate;

    public DailyEmployee(String name, String address, String department, String email, int salary, float workDaysPrice, int dailyRate) {
        super(name, address, department, email, salary);
        this.workDaysPrice = workDaysPrice;
        this.dailyRate = dailyRate;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + (workDaysPrice * dailyRate);
    }

    public float getWorkDaysPrice() {
        return workDaysPrice;
    }

    public void setWorkDaysPrice(float workDaysPrice) {
        this.workDaysPrice = workDaysPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}
