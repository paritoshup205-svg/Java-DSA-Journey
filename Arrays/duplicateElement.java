package Java_Dsa.Arrays;

import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = ss.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        } boolean found = false;
        // int index = 0;
        // int duplicate = 0;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[i]==arr[j]){
        //             found = true;
        //             duplicate=arr[i];
        //                 System.out.println("duplicate found" +"of index"+ " "+i+" "+ " "+ arr[j] + " " +"at index" + " " +j);
        //             break;
        //         }
        //         }
        //     }



        // Approach 2
        // boolean [] flag= new boolean[n+1];
        // for(int i =0;i<n;i++){
        //     int ele = arr[i];
        //     if(flag[ele]==true){
        //         System.out.println("duplicate found" +"of index"+ " "+i+" "+ " "+ arr[i] + " " +"at index" + " " +i);
        //     } else flag[ele]=true;
        // }






        // Apporach 3
        int m = arr.length;
        int sum = (m-1)*(m)/2;
        int arrSUm = 0;
        for(int i = 0;i<arr.length;i++){
            arrSUm +=arr[i];
        }
        System.out.println(arrSUm-sum + " " + "is the  number getting duplicate");
        System.out.println(sum);
        System.out.println(arrSUm);
        }
}
