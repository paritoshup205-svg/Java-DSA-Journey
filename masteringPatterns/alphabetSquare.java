package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class alphabetSquare {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = ss.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
