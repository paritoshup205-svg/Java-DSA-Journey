package Java_Dsa.Arrays;

import java.util.Arrays;

public class ShallocopyDeepcopy {
    public static void main(String[] args) {
        int[]arr={10,20,30,40};
        // int[] x = arr; // x is the shallow copy of arr
        // x[0] = 100;
        // System.out.println(arr[0]);


        int[] deep =  Arrays.copyOf(arr, arr.length);
        deep[0] = 100;
        System.out.println(arr[0]);
        System.out.println(deep[0]); 
    }
}
