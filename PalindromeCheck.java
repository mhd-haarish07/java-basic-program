public class PalindromeCheck {
    public static void main(String[] args) {
        String[] words = {"madam", "hello", "level", "java"};
        for (String w : words) {
            System.out.println(w + " -> " + (isPalindrome(w) ? "Palindrome" : "Not a palindrome"));
        }
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
