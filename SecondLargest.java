public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 41, 31, 10, 45};
        System.out.println("Second largest element = " + findSecondLargest(arr));
    }

    static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
