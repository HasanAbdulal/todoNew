import java.util.Scanner;

public class MethodExer01 {
    // 2. Write a Java method to compute the average of three numbers.
    static float averageNumbers(float n1, float n2, float n3) {
        float average = (n1 + n2 + n3) / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nb1, nb2, nb3;
        System.out.println("Enter the #1 to find the average number integer: ");
        nb1 = input.nextFloat();
        System.out.println("Enter the #2 to find the average number integer: ");
        nb2 = input.nextFloat();
        System.out.println("Enter the #3 to find the average number integer: ");
        nb3 = input.nextFloat();
        float average = averageNumbers(nb1, nb2, nb3);
        System.out.println(
            "The average number among is: " + average + "\n"
        );
    }
}
