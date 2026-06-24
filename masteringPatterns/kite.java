package Java_Dsa.masteringPatterns;

import java.util.Scanner;

public class kite {
     public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = ss.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int j=1;j<=2*i-1;j++){ // stars
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" " + " ");
            }

           for(int j=2*i-1;j>=1;j--){ // stars
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
}
}