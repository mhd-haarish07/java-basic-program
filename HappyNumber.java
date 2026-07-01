public class HappyNumber {
    public static void main(String[] args) {
        int[] numbers = {19, 2, 7, 4, 23};
        for (int num : numbers) {
            System.out.println(num + " -> " + (isHappy(num) ? "Happy Number" : "Not a Happy Number"));
        }
    }

    // Repeatedly replace the number with the sum of squares of its digits.
    // If it reaches 1, it's a happy number; if it loops forever, it's not.
    static boolean isHappy(int num) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = sumOfSquaredDigits(num);
        }
        return num == 1;
    }

    static int sumOfSquaredDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
