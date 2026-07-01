public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Prime numbers up to " + n + ":");
        printPrimes(n);
    }

    static void printPrimes(int n) {
        boolean[] isComposite = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) System.out.print(i + " ");
        }
        System.out.println();
    }
}
