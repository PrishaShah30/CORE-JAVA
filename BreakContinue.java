public class Arithmetic {
    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        // Convert command-line arguments to double
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        // Check if b is not zero to avoid division by zero
        if (b == 0) {
            System.out.println("Cannot divide by zero. Please provide a non-zero second number.");
            return;
        }

        // Perform arithmetic operations
        double sum = a + b;
        double multiply = a * b;
        double divide = a / b;
        double sub = a - b;
        double mod = a % b;

        // Display the results
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + divide);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " % " + b + " = " + mod);
    }
}
