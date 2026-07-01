public class StrongNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 145, 40585, 123};
        for (int num : numbers) {
            System.out.println(num + " -> " + (isStrong(num) ? "Strong Number" : "Not a Strong Number"));
        }
    }

    // A strong number equals the sum of the factorials of its digits (e.g. 145 = 1! + 4! + 5!)
    static boolean isStrong(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
