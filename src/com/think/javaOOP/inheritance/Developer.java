package com.think.javaOOP.inheritance;

public class Developer extends Employee {
    String projectName;

    public Developer() {
        System.out.println("Developer constructor");
    }

    public Developer(String name, String email, String phone, String department, String address, int yearOfBirth, String projectName) {
        super(name, email, phone, department, address, yearOfBirth); // super() is used to call the constructor of 
        // the parent class (Employee) and pass the arguments to it.
        // super() must be the first statement in the constructor.
        // We can also use super.methodName() to call a method from the parent class.
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
