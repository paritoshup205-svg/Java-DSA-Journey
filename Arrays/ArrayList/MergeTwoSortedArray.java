package Java_Dsa.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
          arr.add(2);
        arr.add(5);
        arr.add(6);
        arr.add(9);

        ArrayList<Integer> arr2 = new ArrayList<>();
        //   arr.add(5);
        arr2.add(1);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(7);
        arr2.add(8);

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        // ans.size()=arr.size()+arr2.size();
        while(i<arr.size()&&j<arr2.size()){
            if(arr.get(i)>arr2.get(j)||arr.get(i)==arr2.get(j)){
                ans.add(arr2.get(j));
                // i++;
            j++;

            } else{
                 ans.add(arr.get(i));
                 i++;
            // j++;
            }
            // i++;
            // j++;
            }
            while(i<arr.size()){
                ans.add(arr.get(i));
                i++;
            }
            while(j<arr.size()){
                ans.add(arr2.get(j));
                j++;
            }
        // Collections.reverse(ans);
        System.out.println(ans);
    }
}
