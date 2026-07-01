public class CountVowelsConsonants {
    public static void main(String[] args) {
        countVowelsConsonants("Hello World from Java");
    }

    static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        String lower = str.toLowerCase();
        for (char c : lower.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("String: \"" + str + "\"");
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
