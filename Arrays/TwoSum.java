package Java_Dsa.Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int m = ss.nextInt();
        System.out.println("Enter the index of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ss.nextInt();
        }
        boolean found = false;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == m){
                    System.out.println("Targeted sum found after the addition of index " + i +" & "+ j  );
                    found = true;
                }
            }
        } if(found){
            System.out.println(found);
        } else System.out.println(found);
        }
}
