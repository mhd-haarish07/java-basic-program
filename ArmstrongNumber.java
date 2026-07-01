public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    // e.g. 153 = 1^3 + 5^3 + 3^3
    static boolean isArmstrong(int num) {
        int digits = String.valueOf(num).length();
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }
}
