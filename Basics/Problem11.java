package Java_Dsa.Basics;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length & Breadth");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double P = 2*(a+b);
        double A = a*b;
        System.out.println("Perimeter of the rectangle "+ P);
        System.out.println("Area of the Rectangle "+ A);
        if (A > P){
            System.out.println("Yes Area is greater");
        } else {
            System.out.println("something went wrong");
        }
    }
}
