package sample;

import java.util.Scanner;

public class Reversenumbertype1 {

    public static void main(String[] args) {
        reverseNumber();
    }

    public static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = sc.nextInt();

        int reverse = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Append digit to reverse
            number /= 10; // Remove last digit
        }

        System.out.println("Reversed Number: " + reverse);
    }
}

