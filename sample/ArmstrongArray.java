package sample;
import java.util.Scanner;
public class ArmstrongArray {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int a = s.nextInt();
        int n[] = new int[a];
        System.out.println("Enter the elements:");
        for (int i = 0; i < a; i++) {
            n[i] = s.nextInt();
        }
        
        
        System.out.println("Armstrong numbers are:");
        for (int i = 0; i < a; i++) {
            int num = n[i]; // Get the current number
            int originalNum = num;
            int sum = 0;

            // Calculate the sum of cubes of digits
            while (num > 0) {
                int rem = num % 10;         // Extract last digit
                sum += rem * rem * rem;    // Cube the digit and add to sum
                num /= 10;                 // Remove last digit
            }

            // Check if the sum equals the original number
            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
    }
}
