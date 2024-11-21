package sample;

public class Sumoffoddandeven {

	public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int i = 0;

        while (i <= 10) {
            if (i % 2 == 0)
            {
                sumEven += i; 
            } 
            else {
                sumOdd += i;  
            }
            i++;
        }
        System.out.println("Sum of even numbers (0-10): " + sumEven);
        System.out.println("Sum of odd numbers (0-10): " + sumOdd);
    }

}
