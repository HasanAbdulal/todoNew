import java.util.Scanner;

public class NewKlass {
    /*next();
    nextLine();
    nextInt();
    nextDouble();
    nextFloat();
    nextBoolean();
    nextByte();
    nextShort();
    nextLong();
    nextBigInteger();
    nextBigDecimal();
    nextPattern();*/

    public static void main(String[] args) {
        // Ask the user to enter username
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println(nom);*/

        // Ask the user to enter two numbers and display their sum
        float nb1, nb2, sum;
        Scanner nbOne = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        nb1 = nbOne.nextFloat();

        System.out.print("Enter the second number: ");
        nb2 = nbOne.nextFloat();

        // Without using the () for the sum, the result is wrong. It will concatenate the two numbers instead of adding them.
        // System.out.println("The sum of the two numbers is: " + nb1 + nb2);
        // The Second way to do it is to use the sum, like this : sum = nb1 + nb2; And put the sum in the println
        // System.out.println("The sum of the two numbers is: " + sum);
        sum = nb1 + nb2;
        System.out.println("The sum of the two numbers is: " + sum);

        // Testing the charAt() method with a string input by user
       /* Scanner in = new Scanner(System.in);
        System.out.print("Input a value: ");
        char single = in.next().charAt(0);
        System.out.printf("You have entered : %Single", single);*/

    }
}
