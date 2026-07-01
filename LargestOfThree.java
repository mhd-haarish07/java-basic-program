public class LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 45, c = 7;
        System.out.println("Largest of " + a + ", " + b + ", " + c + " = " + largest(a, b, c));
    }

    static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
