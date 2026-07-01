import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        String s3 = "hello", s4 = "world";

        System.out.println(s1 + " and " + s2 + " -> " + (isAnagram(s1, s2) ? "Anagrams" : "Not Anagrams"));
        System.out.println(s3 + " and " + s4 + " -> " + (isAnagram(s3, s4) ? "Anagrams" : "Not Anagrams"));
    }

    static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
