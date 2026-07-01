public class GCDAndLCM {
    public static void main(String[] args) {
        int a = 36, b = 60;
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("GCD of " + a + " and " + b + " = " + gcd);
        System.out.println("LCM of " + a + " and " + b + " = " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
