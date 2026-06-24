package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class starRectangle {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number of row m: ");
        int m = ss.nextInt();
        System.out.println("Enter the number of row n: ");
        int n = ss.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
