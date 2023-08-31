import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //@formatter:on

        // Count controlled While loop
        // Increment
        /*int counter = 0;
        while (counter < 10) {
            System.out.println("Counter ASC is: " + counter);
            counter++;
        } // counter = 0 -> 9
        System.out.println("Counter ASC is: " + counter);*/ // counter = 10

        // Decrement
        /*int counter2 = 9;
        while (counter2 > 0) {
            System.out.println("Counter Desc is: " + counter2);
            counter2--;
        } // counter2 = 9 -> 0
        System.out.println("Counter Desc is: " + counter2);*/ // counter2 = -1

        // Sentinel controlled While loop
//        char letter = 'a';
//        int counter = 0;
        Scanner input = new Scanner(System.in);
        /*while (letter != 'q') {
            System.out.println("Enter a letter: ");
            letter = input.next().charAt(0);
            counter++;
        }*/

        // Flag controlled While loop
        char letter2 = 't';
        boolean flag = true;
        int counter2 = 0;
        while (flag) {
            System.out.println("Enter a letter: ");
            letter2 = input.next().charAt(0);
            counter2++;
            if (letter2 == 'q') {
                flag = false;
            }
            System.out.println("counter2 is: " + counter2);
        }

        // Sentinel
        float sum = 0;
        float grade = 0;
        int counter = 0;
        while (grade != -1) {
            System.out.println("Enter a grade: " + (counter + 1) + " : ");
            grade = input.nextFloat();
            if (grade != -1) {
                sum += grade;
                counter++;
            }
        }
        System.out.println("The average is: " + sum / counter);
    }
}
