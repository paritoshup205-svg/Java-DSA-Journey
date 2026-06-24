package Java_Dsa.Arrays;

import java.util.Scanner;

public class ArrrayProblem1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the index of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
            if(i%2!=0){
                arr[i]*=2;
            } else arr[i]+=10;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
