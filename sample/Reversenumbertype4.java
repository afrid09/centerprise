package sample;


import java.util.Scanner;

public class Reversenumbertype4 {

    public static void main(String[] args) {
        int reversedNumber = reverseNumber(); 
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = sc.nextInt();

        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit; 
            number /= 10; 
        }

        return reverse;
    }
}
