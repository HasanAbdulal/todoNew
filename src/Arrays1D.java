import java.util.Scanner;

public class Arrays1D {
    //An array is a container object that holds a fixed number of values of a single type. 
    //The length of an array is established when the array is created. After creation, its length is fixed.
    public static void main(String[] args) {
        //1. Declare an array of integers
        int[] myArray;
        //2. Create an array of integers
        myArray = new int[5];
        //3. Initialize an array of integers
        myArray[0] = 13;
        myArray[1] = 25;
        myArray[2] = 39;
        myArray[3] = 40;
        myArray[4] = 52;
        // myArray[5] = 61; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of 
        // bounds for length 5 
        System.out.println("myArray[0] = " + myArray[3]);

        //4. Declare, create and initialize an array of integers
        int[] myArray2 = {1, 6, 6, 7, 2};
        System.out.println("myArray 2[0] = " + myArray2[0] + " \nmyArray 2[1] = " + myArray2[1]);
        //5. Declare, create and initialize an array of integers
        int[] myArray3 = new int[]{1, 2, 3, 4, 5};
        System.out.println("myArray 3[0] = " + myArray3[0] + " \nmyArray 3[1] = " + myArray3[1]);

        //7. Declare, create and initialize an array of strings
        String[] myArray5 = new String[]{"Think", "Pad", "T14s", "Gen", "1"};
        // Normally the index of an array starts from 0 to length - 1
        for (int i = 0; i < myArray5.length; i++) {
//            System.out.println("myArray 5[" + i + "] = " + myArray5[i]);
//            System.out.println(myArray5[i]); // Its print 5 times the first element of the array
        }

        // Foreach loop
        for (String i : myArray5) {
            System.out.println(i);
        }

        // Example 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        System.out.println("scores[0] = " + scores[3]);
    }
}
