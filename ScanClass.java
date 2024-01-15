import java.util.Scanner;

public class ScanClass {
    public static void main(String[] args){
        
        // The Scanner class is used to take input from the console or user.
        // Before using Scanner, we need to import it: import java.util.Scanner;

        // Creating a Scanner object named 'sc' to read input from the console.
        //Scanner sc = new Scanner(System.in);

        // Example of creating an array 'x' of integers with a size of 7.
        // int x[] = new int[7];

        // Creating a Scanner object named 'scr' for various data types:
        // Scanner scr = new Scanner(System.in); // int, char, float, double, string

        // 'new' is a keyword used for memory allocation when creating an object.
        // ClassName objectName = new ClassName();
        // Here, we create a Scanner object 'scr' for input operations.

        // Taking a line of text as input from the user and storing it in the 'name' variable.
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // Printing the input 'name' to the console.
        // System.out.println(name);

        // Additional Scanner methods for different data types:
        // sc.nextInt(), sc.nextFloat(), ... (based on the type of input expected)

        // Closing the Scanner to release system resources (optional but good practice).
        // It's good practice to close the Scanner when done to prevent potential resource leaks.
        // sc.close();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
