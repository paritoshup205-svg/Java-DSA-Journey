package Java_Dsa.masteringLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = ss.nextInt();
        int count = 0;
        int rev = 0;
        int original=n;
        while(original!=0){
            original/=10;
            count++;
        }
        original=n;
        while(n!=0){
            int ld = n%10;
            rev+=(int)Math.pow(ld,count);
            n/=10;
        }
        if(rev==original){
            System.out.println("true");;
        } else System.out.println("false");
    }
}
