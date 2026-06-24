package Java_Dsa.Arrays;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr [i] = ss.nextInt();
        } int m = arr.length+1;
        int arrsum = 0;
        int sum = m*(m+1)/2;
        for(int ele:arr){
            arrsum+=ele;
        }
        System.out.println(sum-arrsum);
    }
}
