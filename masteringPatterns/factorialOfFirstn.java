package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class factorialOfFirstn {
    public static void main(String[] args) {
        System.out.print("Enter the number n: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        long fact = 1;
        for(int i =1;i<=n;i++){
            fact*=i;
            System.out.println(fact);
        } 
    }
}
