public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(10);
    }

    static void printFibonacci(int count) {
        long a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
