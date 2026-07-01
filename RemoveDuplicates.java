import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 1, 5, 2, 6};
        int[] result = removeDuplicates(arr);
        System.out.print("Array without duplicates: ");
        for (int num : result) System.out.print(num + " ");
        System.out.println();
    }

    static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }
}
