package Java_Dsa.masteringPatterns;
import java.util.Scanner;

public class reverseSum {
    public static void main(String[] args) {
        System.out.print("Enter the number n : ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int so = n;
        int rev = 0;
        while(n!=0){
            int ld = n%10;
             rev*=10;
             rev+=ld;
             n/=10;
            }
            System.out.println(rev+so);
}
}
