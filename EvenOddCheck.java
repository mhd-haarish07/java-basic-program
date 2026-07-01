public class EvenOddCheck {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 15, 22, 33};
        for (int num : numbers) {
            System.out.println(num + " is " + (isEven(num) ? "Even" : "Odd"));
        }
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
