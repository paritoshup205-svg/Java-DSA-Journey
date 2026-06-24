package Java_Dsa.masteringPatterns;
import java.util.Scanner;

public class productOfallNonZero {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int product = 1;
       while(n!=0){
        int ld = n%10;
        if(ld!=0){
            product*=ld;
        }
        n/=10;
       }
       System.out.print(product);
    }
}
