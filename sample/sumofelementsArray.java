package sample;
import java.util.Scanner;
public class sumofelementsArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of elements:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+a[i];
        }
        System.out.println("The sum of the elements is: " + sum);
		

}
}
