import java.util.Scanner;

public class ScanClass {
    public static void main(String[] args){
        //Scanner class basically takes an input from the console or more like from the user 
        // we need to enter the file when using scanner : import java.util.scanner;
        /* Scanner scr */
        // Scanner is a class that takes inputs from the user from the console bar 
        // int x[] = new int[7];
        // Scanner scr = new Scanner(System.in);  int char float double string
        // new - keyword for allocation of memory for scr naam na object mateh
        // ClassName objectName = new ClassName();
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        // nextInt()
        // nextFloat()......
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}