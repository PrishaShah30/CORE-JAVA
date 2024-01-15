import java.util.Scanner;

public class Factorial {
    // Function to calculate and return the factorial of a given number
    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number for which factorial needs to be calculated
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Calculate the factorial
        int result = calculateFactorial(inputNumber);

        // Output: Display the factorial result
        System.out.println("Factorial of " + inputNumber + " is: " + result);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
