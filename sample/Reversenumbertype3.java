package sample;

public class Reversenumbertype3 {

	public static void main(String[] args) {
        int number = 12345; // Input number
        int reversedNumber = reverseNumber(number); // Call method and get reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Append digit to reverse
            number /= 10; // Remove last digit
        }
        return reverse;
    }
}
