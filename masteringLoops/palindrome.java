package Java_Dsa.masteringLoops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Digits");
        int n = ss.nextInt();
        int og = n;
        int rev = 0;
        while(n!=0){
            int ld = n%10;
            rev*=10;
            rev = rev+ld;
            n/=10;
        } System.out.println(rev);
        if(og==rev){
            System.out.println("Yes this is a palindrome");
        }
    }
    
}
