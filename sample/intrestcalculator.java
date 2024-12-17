package sample;
import java.util.Scanner;

public class intrestcalculator {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.print("Enter principal amount :"+ " ");
	   double principal=s.nextDouble();System.out.print("Enter rate amount:"+" ");
	   double rate=s.nextDouble();
	   System.out.print("Enter time:"+" ");
	   double time=s.nextDouble();
	   double simpleInterest = (principal * rate * time) / 100;
       double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
       System.out.println("Simple Interest: " + simpleInterest);
       System.out.println("Compound Interest: " + compoundInterest);
	}

}
