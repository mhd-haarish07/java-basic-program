public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 10000:");
        for (int i = 1; i <= 10000; i++) {
            if (isPerfect(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    // A perfect number equals the sum of its proper divisors (e.g. 6 = 1+2+3)
    static boolean isPerfect(int num) {
        if (num < 2) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        return sum == num;
    }
}
