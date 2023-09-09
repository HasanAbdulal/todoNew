package com.think.javaOOP.typeOfRelationships;

public class Employee {
    private int id;
    private float salary;

    private PersoInfo persoInfo; // Composition relationship
    private Department department; // Aggregation relationship

    public Employee(int id, float salary, String firstName, String middelName, String lastName, String bloodGroup,
                    String accountNumber, String nationality, int yearOfBirth,
                    Department department) {
        this.id = id;
        this.salary = salary;
        // Did not submit a PersoInfo class object. Instead, I submitted the parameters of the PersoInfo class constructor
//        this.persoInfo = persoInfo;

        // Overloaded constructor, composition relationship
        // If the Employee class is destroyed, the PersoInfo class object will also be destroyed
        this.persoInfo = new PersoInfo(firstName, middelName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        this.department = department; // Aggregation relationship
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", salary=" + salary +
            ", persoInfo=" + persoInfo +
            ", departmentNo=" + department.getDeptName() +
            ", departmentName=" + department.getDeptNo() +
            '}';
    }
}
