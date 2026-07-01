public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000, rate = 5.5, time = 3;
        double amount = calculateCompoundAmount(principal, rate, time);
        double interest = amount - principal;
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.printf("Compound Interest = %.2f%n", interest);
        System.out.printf("Total Amount = %.2f%n", amount);
    }

    static double calculateCompoundAmount(double principal, double rate, double time) {
        return principal * Math.pow(1 + rate / 100, time);
    }
}
