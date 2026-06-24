package Java_Dsa.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class secondMax {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size  of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        }
        // Arrays.sort(arr);
        // if(arr[n-1]==arr[n-2]){
        //     System.out.println(arr[n-3]);
        // } else System.out.println(arr[n-2]);
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>a){
                a = arr[i];
            }  
        }
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (b<arr[i]&&arr[i]!=a){
                b = arr[i];
            }
        } System.out.println(b);
        
    }
}
