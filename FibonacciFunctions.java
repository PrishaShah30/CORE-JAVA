import java.util.Scanner;

public class FibonacciFunctions {
    public static void main(String args[]) {
        // Fibonacci series: 0 1 1 2 3 5 8 13 21 ...
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " ");

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");

                // Swap values to generate the next Fibonacci number
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        } else if (n == 1) {
            System.out.println();
        } else {
            System.out.println("Invalid input. Please enter a positive integer for the number of terms.");
        }

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
