public class ConditionalsAndLoops {
    public static void main(String args[]) {
        // Example of a simple coin toss simulation
        // if (Math.random() < 0.5) {
        //     System.out.println("Heads");
        // } else {
        //     System.out.println("Tails");
        // }

        // Two Sort: Sorting two numbers in ascending order
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // if (b < a) {
        //     int temp = a;
        //     a = b;
        //     b = temp;
        // }
        // System.out.println(a);
        // System.out.println(b);

        // Three Sort: Sorting three numbers in ascending order
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a < b) {
            // Swap a and b if b is greater
            int temp = a;
            a = b;
            b = temp;
        } else {
            if (b > c) {
                // Swap b and c if b is greater
                int temp = b;
                b = c;
                c = temp;
            } else {
                // Swap c and a if c is greater
                int temp = c;
                c = a;
                a = temp;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
