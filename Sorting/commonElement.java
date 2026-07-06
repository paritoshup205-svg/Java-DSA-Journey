package Java_Dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class commonElement {
    public static void main(String[] args) {
        int [] a = {3,4,2,2,4};
        int [] b = {3,2,2,7};
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList <Integer> arr = new ArrayList<>();

        int i=0,j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                arr.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]!=b[j]&&a[i]<b[j]){
                i++;
            } else if(a[i]!=b[j]&&a[i]>b[j]){
                j++;
            }
        }
        System.out.println(arr);
    }
    
}
