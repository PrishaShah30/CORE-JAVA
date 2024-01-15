public class RecursionFunction {

    // Print numbers from 5 to 1
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    // Print numbers from 1 to 5
    public static void Numprint(int p) {
        if (p == 6) {
            return;
        }
        System.out.println(p);
        Numprint(p + 1);
    }

    // Print the sum of n natural numbers
    public static void printSum(int i, int num, int sum) {
        if (i == num) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, num, sum);
    }

    // Print the factorial of a number n
    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        // factorial of n minus 1 == nm1
        int fact_nm1 = factorial(a - 1);
        int fact_n = a * fact_nm1;
        return fact_n;
    }

    // Print the Fibonacci sequence till the nth term
    public static void fibonacci(int c, int d, int s) {
        if (s == 0) {
            return;
        }
        int e = c + d;
        System.out.println(e);
        fibonacci(d, c, s - 1);
    }

    // Print x^n (stack height = n)
    public static int calcPwr(int x, int w) {
        if (w == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpower1 = calcPwr(x, w - 1);
        int xpown = x * xpower1;
        return xpown;
    }

    public static void main(String args[]) {
        int n = 5;
        printNum(n);

        int p = 1;
        Numprint(p);

        int i = 1;
        int sum = 0;
        int num = Integer.parseInt(args[0]);
        printSum(i, num, sum);

        int a = 5;
        int ans = factorial(a);
        System.out.println(ans);

        int c = 0;
        int d = 1;
        System.out.println(c);
        System.out.println(d);
        int s = 7;
        fibonacci(c, d, s - 2);

        int x = 2;
        int w = 7;
        int answer = calcPwr(x, w);
        System.out.println(answer);
    }
}
