public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34, 89, 10};
        System.out.println("Sum = " + sumOfArray(arr));
        System.out.println("Average = " + averageOfArray(arr));
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    static double averageOfArray(int[] arr) {
        return (double) sumOfArray(arr) / arr.length;
    }
}
