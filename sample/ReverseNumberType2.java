package sample;

public class ReverseNumberType2 {
	public static void main(String[] args) {
		int number=123;
		reversenumber(number);
		
	}
    public static void reversenumber(int number) {
    	 int reverse = 0;
         while (number != 0) {
             int digit = number % 10; // Get the last digit
             reverse = reverse * 10 + digit; // Append digit to reverse
             number /= 10;
    }
         System.out.println("number is"+ " "+reverse);
}
}
