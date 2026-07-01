public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000, rate = 5.5, time = 3;
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest = " + interest);
        System.out.println("Total Amount = " + (principal + interest));
    }

    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
