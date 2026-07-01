public class CountDigits {
    public static void main(String[] args) {
        int num = 987654;
        System.out.println("Number of digits in " + num + " = " + countDigits(num));
    }

    static int countDigits(int num) {
        num = Math.abs(num);
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
