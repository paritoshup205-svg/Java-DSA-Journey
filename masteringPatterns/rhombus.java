package Java_Dsa.masteringPatterns;

import java.util.Scanner;

public class rhombus {
     public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = ss.nextInt();
        for(int i=1;i<=n;i++){ //rows
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int j=1;j<=n;j++){ // stars
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
