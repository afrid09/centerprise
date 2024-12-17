//No arg No return type
package sample;

import java.util.Scanner;

public class functiontype1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sum();
	}
	
	public static void sum()
	{
		// Local variables
		int num1;
		int num2;
		Scanner s=new Scanner(System.in);
		System.out.println(" Accept num1 value ");
		num1=s.nextInt();
		System.out.println(" Accept num2 value ");
		num2=s.nextInt();
		int sum=num1+num2;
		System.out.println(" Sum of values "+sum);
	}

}
     
     

