import java.util.*;

public class Array2D1 {
    public static void main(String args[]) {

        // Declaration of an array
        // Datatype[][] variable/array name = new datatype[rows size][columns size];
        // it's always rows*columns
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // Taking input
        // Rows
        for (int i = 0; i < rows; i++) {
            // Columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output (uncommented)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Take a 2D array as input from the user and search for a given number x.
        // Also, print the indices at which it occurs.
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Compare with x for x to be found
                if (numbers[i][j] == x) {
                    System.out.println("X found at locations (" + i + "," + j + ")");
                }
            }
        }
    }
}
