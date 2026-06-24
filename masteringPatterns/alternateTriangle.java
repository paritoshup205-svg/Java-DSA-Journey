package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class alternateTriangle {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = ss.nextInt();
        // int m = ss.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                System.out.print(j+" ");
                } else System.out.print((char)(j+64) + " ");
        }
        System.out.println();
    }
}
}