package com.think.javaOOP.finalKeyword;

// Final class cannot be extended or inherited
final public class Student {
    final int STUDENT_ID;
    String name;
    int yearOfBrith;
    final static float DEGREE_OF_SUCCESS;

    // static Final Blank initializer block
    static {
        DEGREE_OF_SUCCESS = 50.0f;
    }

    // Final Blank initializer block
    /*{
        System.out.println("Student initializer block");
        STUDENT_ID = 1;
    }*/

    public Student(final int STUDENT_ID, String name, int yearOfBrith) {
        System.out.println("Student constructor");
        this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.yearOfBrith = yearOfBrith;
    }

    // The final method cannot be overridden
    @Override
    final public String toString() {
        return "Student{" +
            "STUDENT_ID=" + STUDENT_ID +
            ", name='" + name + '\'' +
            ", yearOfBrith=" + yearOfBrith +
            '}';
    }
}

// If we wish to add the term public to the class declaration, it must be the first keyword in the file.
/*
class GraduateStudent extends Student {

    public GraduateStudent(int STUDENT_ID, String name, int yearOfBrith) {
        super(STUDENT_ID, name, yearOfBrith);
    }
    // Error: overridden method is final, it's not allowed to override
    */
/*@Override
    public String toString() {
        return "Student{" +
            "STUDENT_ID=" + 34 +
            ", name='" + name + '\'' +
            ", yearOfBrith=" + yearOfBrith +
            '}';
    }*//*

}*/
