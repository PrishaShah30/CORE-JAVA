public class Array2 {
    public static void main(String args[]) {

        /* Print line by line assigned values and reverse them */
        int a[] = { 100, 200, 300, 400, 500 }; // assigned values to array
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
        // there we go with the reverse 
        for (int r = a.length; r >= 0; r--) {
            System.out.println(a[r]);
        }

    }
}