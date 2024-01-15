public class Array2D2 {
    public static void main(String args[]) {
        /* ... (previous code remains unchanged) ... */

        // Check for command line arguments
        if (args.length < 2) {
            System.out.println("Please provide two integers for rows and columns.");
            return; // Exit the program if arguments are not provided
        }

        // Parse command line arguments
        int a = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        // Print elements based on command line arguments
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
