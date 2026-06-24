package Java_Dsa.Arrays;

import java.util.Scanner;

public class rotateArray {
    static void reverse(int arr[] , int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ss.nextInt();
        System.out.println("Enter the part from where you want to rotate");
        int d = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr [i] = ss.nextInt();
        }

         d%=n; // because every complete rotation of n positions brings the array back to where it started.So we reduce d:
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}
