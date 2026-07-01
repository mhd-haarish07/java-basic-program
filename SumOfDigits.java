public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits of " + num + " = " + sumOfDigits(num));
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
