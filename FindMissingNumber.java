public class FindMissingNumber {
    public static void main(String[] args) {
        // Array contains numbers 1..10 with one missing
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        System.out.println("Missing number = " + findMissingNumber(arr, n));
    }

    static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }
}
