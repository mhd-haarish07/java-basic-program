public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 90, 23, 56};
        int target = 34;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
