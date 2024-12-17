package sample;

import java.util.Scanner;

public class fareightocelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = s.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);

    }
}
