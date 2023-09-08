package com.think.javaOOP.polymorphism;

public class HourlyEmployee extends Employee {
    private float workHoursPrice;
    private int hourlyRate;

    public HourlyEmployee(String name, String address, String department, String email, int salary, float workHoursPrice, int hourlyRate) {
        super(name, address, department, email, salary);
        this.workHoursPrice = workHoursPrice;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + (workHoursPrice * hourlyRate);
    }

    public float getWorkHoursPrice() {
        return workHoursPrice;
    }

    public void setWorkHoursPrice(float workHoursPrice) {
        this.workHoursPrice = workHoursPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
