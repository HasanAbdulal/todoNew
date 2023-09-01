import java.util.Scanner;

public class MethodExer00 {
    // 1. Write a Java method to calculate the sum of n integers, who are given by the user, till 5 numbers.
    static int nTimes(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numb = new int[5]; // You need to create an array to store the numbers.
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the #" + (i + 1) + " integer: ");
            numb[i] = input.nextInt(); // You need to store the numbers in the array.

        }
        int total = nTimes(numb);
        System.out.println("The sum of the integers is: " + total + "\n");
    }
}
