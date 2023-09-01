public class RecDirectIndirect {
    static void directRec() {
        directRec(); // This is direct recursion
        System.out.println("Direct Recursion");
    }

    static void indirectRec() {
        indirectRec1(); // This is indirect recursion
        System.out.println("Indirect Recursion");
    }

    static void indirectRec1() {
        indirectRec(); // This is indirect recursion
        System.out.println("Indirect Recursion 1");
    }

    /*
     ** Advantages of Recursion :
     * Simplifies complex problems.
     * Saves time and space.
     * Increases code readability.
     * Enables efficient data processing.
     * Facilitates problem-solving.	*/

    /*
     ** Disadvantages of Recursion :
     * Memory usage.
     * Stack overflow.
     * Difficult to debug.
     * Understanding the code is difficult.
     * Slower execution time.
     * Limited applicability.
     */
    // https://medium.com/@williambdale/recursion-the-pros-and-cons-76d32d75973a

    public static void main(String[] args) {
    }
}
