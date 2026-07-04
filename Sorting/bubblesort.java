package Java_Dsa.Sorting;

import java.util.Scanner;

public class bubblesort {
   public static void print(int []arr){
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
        for(int i =0;i<n;i++){
            arr[i] = ss.nextInt();
        } 
        for(int j = 0;j<n-1;j++){
            boolean swapped=false;
            for(int i =0;i<n-1;i++){
             if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swapped=true;
             }
        }
        if(!swapped){
            break;
        }
        }
        print(arr);
    }
}
