package Java_Dsa.masteringLoops;

import java.util.Scanner;

public class divisibleBy3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter n :");
        int n= ss.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.println(+i);
            }
        }
    }
}
