public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
