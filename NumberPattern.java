public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Number Triangle:");
        printNumberTriangle(rows);

        System.out.println("\nFloyd's Triangle:");
        printFloydsTriangle(rows);
    }

    // Prints:
    // 1
    // 1 2
    // 1 2 3
    static void printNumberTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Prints:
    // 1
    // 2 3
    // 4 5 6
    static void printFloydsTriangle(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
