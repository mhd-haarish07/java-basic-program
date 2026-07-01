public class PowerRecursion {
    public static void main(String[] args) {
        int base = 3, exponent = 5;
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }

    static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
}
