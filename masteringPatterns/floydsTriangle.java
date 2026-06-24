package Java_Dsa.masteringPatterns;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = ss.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
                if(a<=10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
