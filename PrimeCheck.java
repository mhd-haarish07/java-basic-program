public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 20:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
