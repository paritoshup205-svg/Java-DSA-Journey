package Java_Dsa.Basics;
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number");
         int a = sc.nextInt();
         if(a/2==0){
            System.out.println("The no. is Even");
         }
         else{
            System.out.println("The no. is odd");
         }
    }
   
    
}
