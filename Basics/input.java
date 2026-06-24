package Java_Dsa.Basics;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        double pi = 3.1415;
        double area = pi*r*r;
        System.out.println("The Area is "+area);
    }
}
