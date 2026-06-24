package Java_Dsa.Basics;

import java.util.Scanner;

public class straightline {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();
        if((y2-y1)*(x3-x2) == (y3-y2)*(x2-x1)){
            System.out.println("Yes, they fall on the staright line");
        } else System.out.println("They don't fall on the same line");
    }
}
