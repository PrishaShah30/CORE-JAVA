import java.util.*;

public class Factorial {
    public static int PrintFactorial(int c) {
        int factorial = 1;
        for (int i = c; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner p = new Scanner(System.in);
        int c = p.nextInt();
        int factors = PrintFactorial(c);
        System.out.println(factors);
    }
}
