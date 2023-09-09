package com.think.javaOOP.typeOfRelationships;

public class Department {
    private String deptName;
    private int deptNo;

    // No args constructor'
    public Department() {

    }

    // Parameterized constructor
    public Department(String deptName, int deptNo) {
        this.deptName = deptName;
        this.deptNo = deptNo;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    /*@Override
    public String toString() {
        return "Department{" +
            "deptName='" + deptName + '\'' +
            ", deptNo=" + deptNo +
            '}';
    }*/
}
