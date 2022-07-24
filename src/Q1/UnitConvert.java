package Q1;

import java.util.Scanner;

public class UnitConvert {
    public static double MetersToFeet(double _meter) {
        double result;
        result = _meter * 3.28084;
        System.out.println(_meter + " m = " + result + " feet");
        return result;
    }

    public static double FeetToMeters(double _feet) {
        double result;
        result = _feet / 3.28084;
        System.out.println(_feet + " feet = " + result + " meters");
        return result;
    }

    public static double CelsiusToFahrenheit(double _celsius) {
        double result;
        result = (_celsius * 9 / 5) + 32;
        System.out.println(_celsius + "C = " + result + "F");
        return result;
    }

    public static double FahrenheitToCelsius(double _fahrenheit) {
        double result;
        result = (_fahrenheit - 32) * 5 / 9;
        System.out.println(_fahrenheit + "F = " + result + "C");
        return result;

    }

    public static void main(String[] args) {
        double input;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in meters: ");
        input = scanner.nextDouble();

        System.out.println(MetersToFeet(input));

        System.out.println("\nEnter distance in feet: ");
        input = scanner.nextDouble();

        System.out.println(FeetToMeters(input));

        System.out.println("\nEnter temperature in celsius: ");
        input = scanner.nextDouble();

        System.out.println(CelsiusToFahrenheit(input));

        System.out.println("\nEnter temperature in fahrenheit: ");
        input = scanner.nextDouble();

        System.out.println(FahrenheitToCelsius(input));


    }
}


