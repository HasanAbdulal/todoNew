import java.util.Scanner;

public class MethodsExer {
    static int smallestNumber(int n1, int n2, int n3) {
        /*if (n1 < n2 && n1 < n3) {
            return n1;
        } else if (n2 < n1 && n2 < n3) {
            return n2;
        } else {
            return n3;
        }*/
//        return Math.min(Math.min(n1, n2), n3);
        int minNumber = n1;
        if (n2 < minNumber) {
            minNumber = n2;
        }
        if (n3 < minNumber) {
            minNumber = n3;
        }
        return minNumber;
    }

    public static void main(String[] args) {
        // 1. Write a Java method to find the smallest number among three numbers.
        Scanner input = new Scanner(System.in);
        int nb1, nb2, nb3;
        System.out.println("Enter the #1 to find the smallest number integer: ");
        nb1 = input.nextInt();
        System.out.println("Enter the #2 to find the smallest number integer: ");
        nb2 = input.nextInt();
        System.out.println("Enter the #3 to find the smallest number integer: ");
        nb3 = input.nextInt();
        int smallest = smallestNumber(nb1, nb2, nb3);
        System.out.println(
            "The smallest number among is: " + smallest + "\n"
        );
    }
}
