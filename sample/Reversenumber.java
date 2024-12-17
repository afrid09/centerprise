package sample;

public class Reversenumber {
    public static void main(String[] args) {
        int num = 123; 
        int p = num % 10;
        int q = (num / 10) % 10;
        int d = num / 100;
        int reversenumber = (p * 100) + (q * 10) + d;
        System.out.println("The reverse of " + num + " is " + reversenumber);
    }
}
