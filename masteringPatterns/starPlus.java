package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class starPlus {
    public static void main(String[] args) {
        System.out.println("Enter the number n: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int mid =0;
        if(n%2==0){
            mid = n/2;
        } else mid = (n/2)+1;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
        if(j==mid || i==mid){
            System.out.print("* ");
        } else System.out.print("  ");;
            }
            System.out.println();
        }
    }
}
