//Passing arg and no return value
package sample;

import java.util.Scanner;

public class functionstype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner s=new Scanner(System.in);
		System.out.println(" Accept num1 value ");
		num1=s.nextInt();
		System.out.println(" Accept num2 value ");
		num2=s.nextInt();
		
		functionstype2 s1= new functionstype2();
				s1.sum(num1,num2);
	}
	
	public  void sum(int x, int y)
	{
		// Local variables
		
		int sum=x+y;
		System.out.println(" Sum of values "+sum);
	}

}

