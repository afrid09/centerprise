package sample;
import java.util.Scanner;

public class AreaandPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        double area = Math.PI * radius * radius; 
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
