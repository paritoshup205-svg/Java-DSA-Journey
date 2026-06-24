package Java_Dsa.masteringPatterns;

import java.util.Scanner;

public class sumOfdigits {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter n");
        int n = ss.nextInt();
        int sum = 0;
        while(n!=0){
            int lastdigit = n%10;
            sum+=lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
