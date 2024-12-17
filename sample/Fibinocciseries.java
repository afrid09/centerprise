package sample;
import java.util.Scanner;
public class Fibinocciseries {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int sum;
		for(int i=0;i<n;i++) {
			System.out.print(a + " ");
            int next = a + b; 
            a = b;
            b = next;
        }
	}

}
