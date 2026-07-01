public class SimpleCalculator {
    public static void main(String[] args) {
        double a = 20, b = 4;
        System.out.println(a + " + " + b + " = " + calculate(a, b, '+'));
        System.out.println(a + " - " + b + " = " + calculate(a, b, '-'));
        System.out.println(a + " * " + b + " = " + calculate(a, b, '*'));
        System.out.println(a + " / " + b + " = " + calculate(a, b, '/'));
    }

    static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
