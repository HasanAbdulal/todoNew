// Break and continue with labels
public class LabeledBreakContinue {
    public static void main(String[] args) {
        // Labeled Continue
        nextRow:
        for (int row = 1; row <= 5; row++) { // Outer Loop
            System.out.println();
            for (int col = 1; col <= 10; col++) {
                if (col > row) {
                    continue nextRow;
                }
                System.out.print("$");
            }
            System.out.println("Line @"); // This line will not be printed, cause of continue
        }
        // Labeled Break
        /*star:
        {
            for (int row = 1; row <= 10; row++) { // Outer Loop
                for (int col = 1; col <= 5; col++) {
                    if (row == 5) {
                        break star;
                    }
                    System.out.print("* ");
                }
                System.out.println("\\");
            }

        }*/
    }
}
