import java.util.Scanner;

public class FunctionsAndMethods {
    // Syntax of a function is: ReturnType FunctionName(Type argument1, Type argument2) { Operations }
    // Print a given name in a function
    // 'public static' is written by default
    // 'PrintMyName' is called an identifier
    // When we write 'PrintMyName', this is called CamelCase
    public static void PrintMyName(String name) { // Function declaration
        System.out.println(name);
        return;
    }

    // Make a function to add 2 numbers and return the sum
    public static int SumOfNum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // Make a function to multiply 2 numbers and return the product
    public static int ProductOfNum(int a, int b) {
        int mul = a * b;
        return mul;
    }

    // Find the factorial of a number
    // Handle the case where the input is negative
    public static void FactorialOfNum(int c) {
        if (c < 0) {
            System.out.println("Invalid number. Factorial is undefined for negative numbers.");
            return;
        }
        int factorial = 1;
        for (int i = c; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + c + " is: " + factorial);
    }

    public static void main(String args[]) {
        // Take input for the function from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.next();
        PrintMyName(name); // Call the function here

        // Take input for two numbers
        Scanner numScanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = numScanner.nextInt();
        int num2 = numScanner.nextInt();

        // Call the function to find the sum
        int sum = SumOfNum(num1, num2);
        System.out.println("Sum of two numbers is: " + sum);

        // Call the function to find the product
        int product = ProductOfNum(num1, num2);
        System.out.println("The product of given two numbers is: " + product);

        // Take input for a number to find its factorial
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int factorialNum = cs.nextInt();
        FactorialOfNum(factorialNum);
    }
}
