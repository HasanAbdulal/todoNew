package javaLevel1;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        //@formatter:on
        /*Write a JAVA program to calculate grade of student, 
        If mark >= 90 print A grade,
        If mark >= 80 print B grade,
        If mark >= 70 print C grade,
        If mark >= 60 print D grade,
        Otherwise print fail.*/
        int mark;
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        mark = grade.nextInt();
        
        /*if (mark >= 90 && mark <= 100) {
            System.out.println("A grade");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("B grade");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("C grade");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("D grade");
        } else {
            System.out.println("Fail");
        }*/

        /* String gradeLetter = (mark >= 90 && mark <= 100) ? "A" : (mark >= 80 && mark <= 90) ? "B" : (mark >= 70 && mark <= 80) ? "C" : (mark >= 60 && mark <= 70) ? "D" : "Fail";
        System.out.println("Your grade is: " + gradeLetter);*/


    }
}
