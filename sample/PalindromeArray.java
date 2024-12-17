package sample;
import java.util.Scanner;
public class PalindromeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of elements");
		int a=s.nextInt();
		int n[]=new int[a];
		System.out.println("Enter elements");
		for(int i=0;i<a;i++) {
			n[i]=s.nextInt();
			}
		for(int i=0;i<a;i++) {
			if((n[i] != n[a - 1 - i])) {
			System.out.println("Palindrome");
			}
		}
		
		}

	


