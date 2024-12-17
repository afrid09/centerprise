package sample;
import java.util.Scanner;
public class sumOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the number:");
	        int number = s.nextInt();
	        int digit1 = number / 100;       
	        int digit2 = (number / 10) % 10; 
	        int digit3 = number % 10;        
	        
	        
	        int sum = digit1 + digit2 + digit3;
	        System.out.println("the sum of number is"+sum);
	}

}
