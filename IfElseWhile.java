public class IfElseWhile {
    public static void main(String args[]) {
        // Cake size and their price
        // Parsing the first argument as a double
        double cakeSize = Double.parseDouble(args[0]);
        
        // Check if the cake size is less than or equal to 0
        if (cakeSize <= 0) {
            System.out.println("Error");
        } else {
            // Check different conditions for calculating the bill based on cake size
            if (cakeSize < 6) {
                System.out.println("Your bill is charged for $15");
            } else {
                System.out.println("Your bill is charged for $20");
            }
        }

        // while loop to calculate the sum of numbers up to n
        int n = Integer.parseInt(args[1]); // Change args[0] to args[1]
        int sum = 0;
        while (n > 0) {
            sum += n;
            n -= 1;
        }
        // Print the sum after the while loop
        System.out.println("Sum of 1 up to and including " + n + " is " + sum);

        // Nested loops to print rows and columns
        int p = Integer.parseInt(args[2]); // Change args[0] to args[2]
        for (int r = 1; r <= p; r++) {
            for (int c = 1; c <= p; c++) {
                System.out.print(r + "," + c + " ");
            }
            System.out.println();
        }
    }
}
