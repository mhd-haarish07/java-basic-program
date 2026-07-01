public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 37.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        double f = 98.6;
        double c = fahrenheitToCelsius(f);
        System.out.println(f + "°F = " + c + "°C");
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
