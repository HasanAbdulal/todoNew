public class RecursionMExer {
    // Fibonacci series
    /*
     * 0 1 2 3 4 5 6 7  8  9  10 11 12 ...etc.
     * 0 1 1 2 3 5 8 13 21 34 55 89 144 ... etc.
     * */
    // Create a software that output the number of Fibonacci series in the 7th position.
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Print the fibonacci series till 6 terms
    // Write a program to print fibonacci series till 6 terms
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFib(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFib(n - 1); // 
        }
    }

    // Write a program that calculates the sum of numbers between 1 and 5 using recursion : 1 + 2 + 3 + 4 + 5 = 15
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Second way
    static int sum2(int a, int b) {
        if (a == b) {
            return a;
        }
        return a + sum2(a + 1, b); // But this method doesn't work if a > b : (6,4) X
    }

    // To resolve the problem of a > b
    static int sum1(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a < b) {
                return a + sum1(a + 1, b);
            } else {
                return a + sum1(a - 1, b);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci : " + fibonacci(7)); // 13

        System.out.print("Fibonacci series till 6 terms : " + n1 + " " + n2); // 0 1 1 2 3 5
        int num = 6;
        printFib(num - 2); // -2 because of best case n1 and n2 are already printed

        System.out.println("\nSum of numbers between 1 and 8 : " + sum(8)); // 36

        System.out.println("Sum of numbers between 1 and 9 : " + sum2(1, 9)); // 45

        // To calculate the sum of numbers between 1 and 10
        int upper = 10;
        int lower = 1;
        int sum1 = (upper - lower + 1) * (lower + upper) / 2;
        System.out.println("Sum of numbers between 1 and 10 : " + sum1); // 55

        System.out.println("Sum of numbers between 10 and 1 : " + sum1(10, 1)); // 55
    }
}
