package javaLevel1;

public class RecursionMethods {
    /*
     * Recursion javaLevel1.Methods :
     * Recursion in java is a process in which a method calls itself continuously.
     * A method in java that calls itself is called recursive method.
     * */
    static int count = 0; // We added the static keyword to make it accessible in the main method

    static void p() {
        count++; // The count should be declared before the method, otherwise if it is declared after the condition 
        // it will run infinitely
        if (count <= 5) { // Without this condition it [p()] will run infinitely
            System.out.println("Hello " + count);
            p();
        }
//        count++; // It will run infinitely, in this place, which is incorrect. X
    }

    // 2 case
    static void p2() {
        if (count == 5)
            return;
        count++;
        System.out.println("Hello " + count);
        p2();
    }

    public static void main(String[] args) {
        p2(); // Invoking the method
        p();
    }
}
