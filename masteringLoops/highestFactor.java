package Java_Dsa.masteringLoops;

import java.util.Scanner;

public class highestFactor {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter n :");
        int n  = ss.nextInt();
        int hf=0;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
                hf=i;
                break;
            }
        } System.out.println(" highest factor of n is "+ hf);
    }
}
