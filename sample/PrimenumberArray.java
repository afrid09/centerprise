package sample;
import java.util.Scanner;
public class PrimenumberArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%a[i]==0 && a[i]%1==0) {
				System.out.println("The prime numbers are:");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
			

	}

}
