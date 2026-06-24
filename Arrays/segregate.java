package Java_Dsa.Arrays;

import java.util.Scanner;

public class segregate  {
    public static void change(int arr[]){
        int numberOfZero = 0;
        int numberOfOne = 0;
        for(int ele:arr){
            if(ele==0){
                numberOfZero++;
            } else numberOfOne++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<numberOfZero){
                arr[i] = 0;
            } else arr[i] = 1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static void main(String[] args) {
         Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr [i] = ss.nextInt();
        }
        change(arr);
    }
}
