package sample;

public class dAlphabetprint {
	 
	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=10; j++) {
				
				if((j==1 && i>=1 && i<=7)||(i==1 && j>=2 && j<=10)||(i==7 && j>=2 && j<=10)||(j==10 && i>=1 && j<=10))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
 
	}
}
