public class Array2D2 {
    public static void main(String args[]) {

        /*- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
        //2d array declaration and initialize
        int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
        // i = row [1 0] [2 0] [3 0]
        for (int j = 0; j < 3; j++) {
        // j= column [0 1] [0 2]
        System.out.print(n[i][j] + " ");
        }
        System.out.println();
        // it's help me change a row and reason being it is supposed to be outside the j
        // loop and not outside both of em'
        }

        /*
         * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         * - - - - - - - - - - - - - - - - - - - - - - - -
         */
        int a = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for (int i = 0; i < a; i++) {
            // i = row [1 0] [2 0] [3 0]
            for (int j = 0; j < m; j++) {
                // j= column [0 1] [0 2]
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
            // it's help me change a row and reason being it is supposed to be outside the j
            // loop and not outside both of em'
        }

    }
}