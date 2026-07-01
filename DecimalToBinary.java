public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 156;
        System.out.println("Binary of " + num + " = " + decimalToBinary(num));
    }

    static String decimalToBinary(int num) {
        if (num == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }
}
