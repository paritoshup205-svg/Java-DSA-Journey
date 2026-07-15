package Java_Dsa.Sorting;
import java.util.Scanner;

import Java_Dsa.Arrays.forEach;
public class SlectionSort {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n = s.nextInt();
        // int [] arr = new int[n];
        // for(int i = 0;i<n;i++){
        //     arr[i]=s.nextInt();
        // }

        int [] arr={7,3,4,7,8,1};

        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
                minIndex=j;
            }
        } 
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
        } for(int ele:arr){
            System.out.println(ele+" ");
        }
       
    }
    
}
