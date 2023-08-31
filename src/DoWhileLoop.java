import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //@formatter:on
        // Do-While loop VS While loop
        int counter = 0;
        do {
            System.out.println("Java is fun");
            counter++;
        } while (counter == -1); // Print once even if the condition is false

        // Sentinel controlled Do-While loop VS While loop
        Scanner spa = new Scanner(System.in);
        char letter; // Doesn't need to be initialized before the loop
        int c = 0;
        do {
            System.out.println("Enter a letter: ");
            letter = spa.next().charAt(0);
            c++;
        } while (letter != 'q');

        // While loop
        char letter1 = 'a'; // Needs to be initialized before the loop
        int c1 = 0;
        while (letter1 != 'q') {
            System.out.println("Enter a letter: ");
            letter1 = spa.next().charAt(0);
            c1++;
        }
    }
}
