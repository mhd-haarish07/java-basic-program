public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "10011100";
        System.out.println("Decimal of " + binary + " = " + binaryToDecimal(binary));
    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
