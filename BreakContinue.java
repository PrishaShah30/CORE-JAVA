public class BreakContinue {
    public static void main(String args[]) {
        // Break Statement:
        // It is not commonly used, as continuous checks to determine where the
        // code broke and where it continues can be challenging for maintenance.

        // Example of break:
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         break; // Jump out of the loop when i is 3
        //     }
        //     System.out.println(i);
        // }
        // Execution continues here after the loop;
        // System.out.println("Line after the loop");

        // Continue Statement:
        // This statement skips the remaining code inside a loop for a particular
        // condition and continues with the next iteration.

        // Example of continue:
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue; // Skip this iteration when i is 2, and continue with the next line
                // It's like, excluding this particular case, the loop continues normally.
            }
            System.out.println("Line after the loop");
        }
    }
}
