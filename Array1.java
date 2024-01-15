import java.util.Scanner; //imported package - (folder) /(just like include stdio) 

public class Array1 {
    public static void main(String args[]) {
        // Array is the collection of the same type of data and is of two types:- 1D
        // array and 2Darray
        // syntax of an array in java is :-
        // int a[] ;
        // a = new int[size];
        // here new is where memory is allocated
        // a[0]= here 0 is the index, also known as subscript
        // size of array is a[0]....a[n-1]
        // You cannot directly print an array you need to call it in a loop
        // and then print if you dont do so you'll receive memory address-- hashcode

        /*
         * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         */

        /* Print from index 0 to 5 */

        // int ArrayName[] = new int[5];// declaration and assigned a size together
        // for (int i = 0; i < 5; i++) {
        //     ArrayName[i] = i;
        //     System.out.println(ArrayName[i]);
        // }

        /*
         * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
         */

        /* Assign values and print with the digits with its index numbers */

        // int array2[] = { 12, 43, 23, 54, 65, 76, 43, 23, 45, 66, 77, 54, 37, 23, 57,
        //         79 };
        // System.out.println(array2[5]);

        // for (int p = 0; p < array2.length; p++) {
        //     System.out.println(p + " " + array2[p]);
        // }

        /*
         * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * - - - - - - - - - - - - - - - - - - - - - - - -
         */
        /* Print random number in a 2D array */

        // 2D array has two dimensions [] [] 
        // first for the rows and second for columns
        // double array3[][] = new double[5][7];
        // for (int r = 0; r < array3.length; r++) {
        //     for (int c = 0; c < array3[0].length; c++) {
        //         array3[r][c] = Math.random();
        //         System.out.println(array3[r][c]);
        //     }
        // }

        /*
         * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         */

        /* Check for IndexOutoFbOUNDeXCEPTION ERROR */

        // double c[] = new double[10];
        // for (int p = 0; p < c.length; p++) {
        //     double temp = Math.random();
        //     System.out.println(p + " " + temp);
        // }
        // // a[0] = 1;
        // c[0] = 2147483647;
        // System.out.println(c[9]);// no compilation error

        /*
         * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         */

        /* Scanner scr */
        // Scanner is a class that takes inputs from the user from the console bar 
        int x[] = new int[7];
        Scanner scr = new Scanner(System.in); // int char float double string
        // new - keyword for allocation of memory
        // ClassName objectName = new ClassName();

        for (int i = 0; i < x.length; i++) { // 7
            System.out.println("Enter value");
            x[i] = scr.nextInt(); // x[0] x[1] x[2] x[3] x[4]
        }

        // all these are methods :
        // nextInt();
        // nextFloat();
        // nextDouble();
        // next(); 
        // nextLine(); 
        // System.out.println(x);
        // for (int i = 0; i < x.length; i++) {
        //     System.out.println(x[i]);
        // }
    }
}
