package Q1;

import java.util.Scanner;

public class Conversion_Main {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        UnitConvert.MetersToFeet(scanner.nextDouble());

        System.out.print("\nEnter distance in feet: ");
        UnitConvert.FeetToMeters(scanner.nextDouble());

        System.out.print("\nEnter temperature in celsius: ");
        UnitConvert.CelsiusToFahrenheit(scanner.nextDouble());

        System.out.print("\nEnter temperature in fahrenheit: ");
        UnitConvert.FahrenheitToCelsius(scanner.nextDouble());
    }
}
