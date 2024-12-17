package sample;
import java.util.Scanner;
public class AverageArray {
     
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       System.out.print("Enter no of elements: ");
       int n=s.nextInt();
       int a[]=new int[n];
       System.out.print("Enter elements: ");
       for(int i=0;i<a.length;i++) {
    	   a[i]=s.nextInt();
    	   
       }
       int sum=0;
       float avg=0;
       for(int i=0;i<a.length;i++) {
    	   sum=sum+a[i];
    	   avg=sum/a.length;
	}
System.out.println("The average is: "+avg);
}
}