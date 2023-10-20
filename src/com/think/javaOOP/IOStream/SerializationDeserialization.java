package com.think.javaOOP.IOStream;

import java.io.*;
import java.util.ArrayList;

public class SerializationDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st1 = new Student(1, "John", 90);
        Student st2 = new Student(2, "Ters", 93);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);

        File file = new File("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        oos.writeObject(students);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Student> students1 = (ArrayList<Student>) ois.readObject();
//        Student s2 = (Student) ois.readObject();
        for (Student s : students1) {
            System.out.println(s);
        }
    }
}
