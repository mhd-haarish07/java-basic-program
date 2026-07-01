public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reverse of " + num + " = " + reverseNumber(num));
    }

    static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
