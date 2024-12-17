//Passing arg and return value
package sample;

import java.util.Scanner;

public class functionstype3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner s=new Scanner(System.in);
		System.out.println(" Accept num1 value ");
		num1=s.nextInt();
		System.out.println(" Accept num2 value ");
		num2=s.nextInt();
		
		functionstype3 s1= new functionstype3();
				int result=s1.sum(num1,num2);
		System.out.println(" Sum of values "+result);
	}
	
	public  int sum(int x, int y)
	{
		// Local variables
		
		int sum=x+y;
		return sum;
		
	}

}