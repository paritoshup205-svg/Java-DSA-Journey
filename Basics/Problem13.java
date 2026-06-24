package Java_Dsa.Basics;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner x = new Scanner(System.in);
        double y = x.nextDouble();
        if(y%5 == 0 && y%3==0){
            System.out.println("Yes, the number the divisible by both 5&3");
        } else if (y%5 == 0){
            System.out.println("The number is only divisible by 5");
        } else if(y%3 == 0){
            System.out.println("The number is only divisible by 3");
        } else System.out.println("The number is neither divisible by 3 nor 5");
    }

}
