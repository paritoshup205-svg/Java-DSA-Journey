package Java_Dsa.Methods;

import java.util.Scanner;

public class pascalTriangle {
    public static int fact(int n){
        int factorialOfn = 1;
        for(int i = 1;i<=n;i++){
            factorialOfn*=i;
        }
        return factorialOfn; }
    public static void main(String[] args) {
         Scanner ss = new Scanner(System.in);
        System.out.print("Enter n: ");
         int n = ss.nextInt();
         for(int i = 0; i<= n; i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                int icj = fact(i)/(fact(j)*fact(i-j));
                System.out.print(icj+"   ");
            }
            System.out.println();
         }

    }
}
