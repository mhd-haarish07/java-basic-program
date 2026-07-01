public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Sum of first " + n + " natural numbers (iterative) = " + sumIterative(n));
        System.out.println("Sum of first " + n + " natural numbers (recursive) = " + sumRecursive(n));
    }

    static int sumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    static int sumRecursive(int n) {
        if (n <= 0) return 0;
        return n + sumRecursive(n - 1);
    }
}
