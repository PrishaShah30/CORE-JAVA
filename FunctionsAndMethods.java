import java.util.*;

public class FunctionsAndMethods {
    // Systax of a function is : ReturnType FunctionName(type argument1, type argument2){  Operations   }
    // Print a given name in a function
    // public static is to be written by default 
    // PrintMyName is called an identifier 
    // when we write PrintMyName this is called CamelCase
    public static void PrintMyName(String name){ // declared the function here 
        System.out.println(name);
        return;
    }
    // Make a function to add 2 numbers andreturn the sum 
    public static int SumOfNum(int a, int b){
       int sum = a +b ;
       return sum;
    }
    //Make a functions to multiply 2 numbers and return the product
    public static int ProductOfNum(int a, int b){
        int mul = a*b;
        return mul;
        }
    //Fund the factorial of a number 
    public static void FactorialOfNum(int c){ 
        if(c<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial =1;
        for(int i=c;i>=1;i--){
            factorial = factorial* i;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        // we take the input for the function, from the user, here 
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        PrintMyName(name); // called the function here 
       
        // we make a scanner class in the main class 
        // we'll ask the for input in here 
        // we'll give the values of asked input to the functions
        // the funtion will take the input use it's operations that are commanded and then give the output 
        // we store the return output in sum and then printed sum in the main function 
        // functions are just for taking the input from the main class and then using it's given operations and compands and then give out the output which is called and printed from the main class
        Scanner Num = new Scanner(System.in);
        int a = Num.nextInt();
        int b = Num.nextInt();

        int sum = SumOfNum(a ,b);
        System.out.println("Sum of two numbers is:" + sum);
        
        int mul = ProductOfNum(a, b);
        System.out.println("The product of given two numbers is:"+ mul);
        
        Scanner cs = new Scanner(System.in);
        int c = cs.nextInt();
        FactorialOfNum(c);
    }
}
