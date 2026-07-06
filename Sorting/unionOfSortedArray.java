package Java_Dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class unionOfSortedArray {
    public static void main(String[] args) {
        int [] a = {3,4,2,2,4};
        int [] b = {3,2,2,7};
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList <Integer> arr = new ArrayList<>();
         int i=0,j=0;
          while(i<a.length&&j<b.length){
            if(a[i]>b[j]){
                if (arr.isEmpty() || arr.get(arr.size() - 1) != b[j]) {
    arr.add(b[j]);
}
                j++;
            } else if(a[i]<b[j]) {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
    arr.add(a[i]);
}
                i++;
            } else {
                if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
    arr.add(a[i]);
}
                i++;
                j++;
            }
        }
         while(j<b.length){
                if (arr.isEmpty() || arr.get(arr.size() - 1) != b[j]) {
    arr.add(b[j]);
}
                j++;
            }
        while(i<a.length){
               if (arr.isEmpty() || arr.get(arr.size() - 1) != a[i]) {
    arr.add(a[i]);
}
                i++;
            }
            System.out.println(arr);
    }
}
