package Java_Dsa.Arrays;

import java.util.Scanner;

public class segregateUsingReverse {
      public static void segregate0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] == 0) {
                left++;
            }

            while (left < right && arr[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
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
        segregate0and1(arr);
    }
}
