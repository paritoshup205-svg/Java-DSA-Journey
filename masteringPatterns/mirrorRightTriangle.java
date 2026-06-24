package Java_Dsa.masteringPatterns;
import java.util.Scanner;

public class mirrorRightTriangle {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = ss.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j<=n){
        //             System.out.print("  ");
        //         } else System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int j=1;j<=i;j++){ // stars
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
