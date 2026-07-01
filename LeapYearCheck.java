public class LeapYearCheck {
    public static void main(String[] args) {
        int[] years = {2000, 2020, 1900, 2023, 2024};
        for (int year : years) {
            System.out.println(year + " -> " + (isLeapYear(year) ? "Leap Year" : "Not a Leap Year"));
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
