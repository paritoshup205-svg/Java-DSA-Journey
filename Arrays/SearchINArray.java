package Java_Dsa.Arrays;

import java.util.Scanner;

public class SearchINArray {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int m = ss.nextInt();
        System.out.println("Enter the index of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(m==arr[i]){
                System.out.println("Number found at index " + i);
                found = true;
            } 
            // System.out.print(arr[i] + " ");
        } System.out.println();
        if(found){
            System.out.println("Yes the search is over and the given number is the part of this array ");
        } else System.out.println("No the number is not the part of this array");
    }
}
