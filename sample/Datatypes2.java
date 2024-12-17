package sample;

import java.util.Scanner;

public class Datatypes2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter num1 value:");
        int num1 = s.nextInt(); // Correct method is nextInt()
        
        System.out.println("Enter num2 value:");
        int num2 = s.nextInt(); // Correct method is nextInt()
        
        int sum = num1 + num2; // Declare the sum variable
        
        System.out.println("Sum of values: " + sum);
        
       
    }
}


