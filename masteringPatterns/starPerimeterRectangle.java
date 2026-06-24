package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class starPerimeterRectangle {
    public static void main(String[] args) {
        System.out.println("Enter m & n : ");
        Scanner ss = new Scanner(System.in);
        int m = ss.nextInt();
        int n = ss.nextInt();
        for(int i =1;i<=m;i++){
            for(int j =1;j<=n;j++){
                if (i==1 || i==m || j==1 || j==n) {
                    System.out.print("* ");
                } else System.out.print("  ");
            } System.out.println();
        }
    }
}
