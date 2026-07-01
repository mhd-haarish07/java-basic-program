// reverse string


public class ReverseString {
    public static void main(String[] args) {
        String str = "harish";
        System.out.println("Reverse of \"" + str + "\" = " + reverseString(str));
    }

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
}
