package sample;
import java.util.Scanner;

public class SubMethod {

	public static void main(String[] args) {
		System.out.println("This is method1");
		subtraction1();
		System.out.println("This is method2");
		Scanner S=new Scanner(System.in);
		System.out.println("Enter sum1 ");
		int num1=S.nextInt();
		System.out.println("Enter sum2 ");
		int num2=S.nextInt();
        subtraction2(num1,num2);
        System.out.println("This is method3");
		int output1=subtraction3(num1,num2);
		System.out.println("The sub 3 is "+output1);
		System.out.println("This is method4");
		int output2=subtraction4();
		System.out.println("the sub4 is"+output2);
		
		

	}


    public static void subtraction1() {
    	Scanner S=new Scanner(System.in);
    	System.out.println("Enter sum1 ");
    	int num1=S.nextInt();
    	System.out.println("Enter sum2 ");
    	int num2=S.nextInt();
    	int sub1=num1-num2;
    	System.out.println("Sub1 is "+sub1);
    }

  public static void subtraction2(int a, int b) {
	  int num3=a-b;
	System.out.println("sub 2 is "+ num3);
  }
  public static int subtraction3(int a, int b) {
	  int num4=a-b;
	  return num4;
	   
  }
  
  public static int subtraction4() {
	  Scanner S=new Scanner(System.in);
		System.out.println("Enter sum1 ");
		int num1=S.nextInt();
		System.out.println("Enter sum2 ");
		int num2=S.nextInt();
		return num1-num2;
  }
  
  }
      
  