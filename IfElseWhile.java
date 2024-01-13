public class IfElseWhile {
    public static void main(String args[]) {
        // Cake size and their price
        double cakesize = Double.parseDouble(args[0]);
        if (cakesize <= 0) {
            System.out.println("Error");
        } else {
            if (cakesize < 6) {
                System.out.println("Your bill is charged for $15");
            } else {
                System.out.println("Your bill is charged for %20");
            }
        }
        // a while code
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        while (n > 0) {
            sum += n;
            n -= 1;
        }
        System.out.println("Sum of 1 up to and including " + n + " is " + sum);
        // total number of operations : 3n+4
        // for loop : rows and colums
        // 1,1 1,2 1,3 1,4
        // 2,1 2,2 2,3 2,4
        // 3,1 3,2 3,3 3,4s
        // 4,1 4,2 4,3 4,4
        int p = Integer.parseInt(args[0]);
        for (int r = 1; r <= p; r++) {
            for (int c = 1; c <= p; c++) {
                System.out.print(r + "," + c + " ");
            }
            System.out.println();
        }
    }
}