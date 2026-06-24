package Java_Dsa.masteringLoops;

import java.util.Scanner;


public class decrement {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter n :");
        int n= ss.nextInt();
        for(int i=n;i>=1;i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}