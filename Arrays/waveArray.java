package Java_Dsa.Arrays;

import java.util.Scanner;

public class waveArray {
    public static void main(String[] args) {
         Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr [i] = ss.nextInt();
        }
        for(int i=0;i<arr.length-1;i+=2){
        //    if(i==arr.length-1) break;
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
