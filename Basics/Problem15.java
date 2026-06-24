package Java_Dsa.Basics;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner ss = new Scanner(System.in);
        double x = ss.nextDouble();
        double y = ss.nextDouble();
        double z = ss.nextDouble();
        if(x+y>z && x+z>y && y+z>x){
            System.out.println("Yes,these values can form a triangle");
        }  else System.out.println("The triangle can't be formed");      
    }
}
