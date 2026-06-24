package Java_Dsa.Basics;

import java.util.Scanner;

public class XYaxis {
    public static void main(String[] args) {
        System.out.println("Enter the coordinate x1");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        System.out.println("Enter the coordinate y1");
        double y1 = sc.nextDouble();
        if(x1==0 && y1==0){
            System.out.println("It lies on the origin (0,0)");
        }else if(x1==0){
            System.out.println("It lies on the Y-axis");
        } else if(y1==0){ 
            System.out.println("It lies on the X-axis");
        } else System.out.println("It lies in between");
        sc.close();
           
    }
}
