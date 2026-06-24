package Java_Dsa.masteringLoops;

import java.util.Scanner;

public abstract class ap {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        for (int i=1;i<=2*n-1;i+=2){ //an = a+(n-1)*d
            System.out.println(i);
        }
    }
}
