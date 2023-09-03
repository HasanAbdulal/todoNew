package javaLevel1;

import java.util.Scanner;

/*
 * Branching Statements
 * The break Statement: Causes immediate exit from control structure
 * The Continue statement: Skips remaining statements in loop body*/
public class BranchingState {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; // unlabeled break
            }
            System.out.println("i break = " + i);
        }*/ // print 0 to 4 : 5 numbers

        /*for (int i = 0; i <= 10; i++) {
            if (i <= 4) {
                continue; // unlabeled break
//                System.out.println("This line will never be reached!");
            }
            System.out.println("i continue = " + i);
        } // print 5 to 10, without 4 
        System.out.println("End of program!");*/

        /* Example: We have three possibilities to answer this question, but only one is accurate.
         * We give the user three chances to answer the question correctly.
         * If the user answers correctly, we print "Correct answer !", otherwise we print "Wrong answer! Try again!"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Test yourself!");
        System.out.println("What's the answer of '3+1/10*2'?");

        float userAnswer, correctAnswer = 3.2f;
        boolean questionAnswered = false;

        for (int i = 1; i <= 3; i++) {
            userAnswer = input.nextFloat();

            if (userAnswer == correctAnswer) {
                questionAnswered = true;
                break;
            } else if (userAnswer != correctAnswer) {
                if (i == 3) { // To avoid printing "Chance 4 of 3"
                    continue;
                }
                System.out.println("Chance " + (i + 1) + " of 3");
            }
        }
        if (questionAnswered) {
            System.out.println("Correct answer !");
        } else {
            System.out.println("Wrong answer! Try again!");
        }
    }
}
