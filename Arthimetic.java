public class Arthimetic {
    public static void main(String[] args) {
        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double sum = a + b;
        double multiply = a * b;
        double divide = a / b;
        double sub = a - b;
        double mod = a % b;
        System.out.println(a + "+ " + b + "= " + sum);
        System.out.println(a + " *" + b + "= " + multiply);
        System.out.println(a + " /" + b + "= " + divide);
        System.out.println(a + " -" + b + "= " + sub);
        System.out.println(a + "% " + b + "= " + mod);
    }
}