package Java_Dsa.masteringPatterns;

import java.util.Scanner;

public class properTrianle {
     public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = ss.nextInt();
        // for(int i=1;i<=n;i++){ //rows
        //     for(int j=1;j<=n-i;j++){ // spaces
        //         System.out.print(" " + " ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){ // stars
        //         System.out.print((char)(j+64)+ " ");
        //     }
        //     System.out.println();
        // }
        int nsp = n-1 , nst = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            } for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst++;
            System.out.println();
        }

        System.out.println();
        System.out.println();

         for(int i = n; i >= 1; i--) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
