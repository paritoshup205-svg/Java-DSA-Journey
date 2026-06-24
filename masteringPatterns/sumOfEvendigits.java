package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class sumOfEvendigits {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            if(ld%2==0){
                sum+=ld;
            }
            n/=10;
        } System.out.println(sum);
    }
}
