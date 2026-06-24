package Java_Dsa.Basics;
import java.util.Scanner;
public class Problem10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        double a = sc.nextInt();
        if(a%4==0){
            System.out.println("The given yr is a leap year");
        }
        else{
            System.out.println("Given yr is not a leap yr");
        }
    }
}