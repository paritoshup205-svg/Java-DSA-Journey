package Java_Dsa.Basics;
import java.util.Scanner;

public class circleCoordinate {
    public static void main(String[] args) {
        System.out.println("Enter the x of circle");
        Scanner pp = new Scanner(System.in);
        double x = pp.nextDouble();
        System.out.println("Enter the y of circle");
        double y = pp.nextDouble();

        System.out.println("Enter the radius of the circle");
        double r = pp.nextDouble();

        System.out.println("Enter the x1 coordinate of the positions");
        double x1 = pp.nextDouble();
        System.out.println("Enter the y1 coordinate of the positions");
        double y1 = pp.nextDouble();

        double d = Math.pow(x1-x,2)+Math.pow(y1-y,2);
        r = r*r;
        if(d<r){
            System.out.println("Point lies inside the circle");
        }
        else if(d==r){
            System.out.println("Point lies on the circle");
        }
        else System.out.println("Point lies outside the circle");
        pp.close();
    }
}

