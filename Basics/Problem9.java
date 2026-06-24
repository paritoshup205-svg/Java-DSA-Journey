package Java_Dsa.Basics;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no.");
       double a = sc.nextInt();
       if(a%5==0){
        System.out.println("No. is divisible by 5");
       }
       else{
        System.out.println("The no. is not divisible by 5");
       }

    }
}
