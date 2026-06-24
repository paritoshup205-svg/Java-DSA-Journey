package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class starCross {
    public static void main(String[] args) {
        System.out.println("Enter m & n : ");
        Scanner ss = new Scanner(System.in);
        int m = ss.nextInt();
        int n = ss.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
        if(j==i || i+j==n+1){
            System.out.print("* ");
        } else System.out.print("  ");;
            }
            System.out.println();
        }
    }
}
