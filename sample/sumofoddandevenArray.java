package sample;
import java.util.Scanner;
public class sumofoddandevenArray {
        public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int a=s.nextInt();
		int n[]=new int[a];
		System.out.println("Enter elements");
		for(int i=0;i<a;i++) {
			n[i]=s.nextInt();
		}
		     int Evensum=0;
		     int Oddsum=0;
			 for(int i=0;i<a;i++) {
				if(n[i]%2==0) {
				Evensum=Evensum+n[i];
				}
				else {
					Oddsum=Oddsum+n[i];
				}
				
		}
			System.out.println("The even sum is:"+Evensum);
			System.out.println("The odd sum is:"+Oddsum);
		}
}