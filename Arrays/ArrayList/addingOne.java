// GFG
// Difficulty : Easy
//Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.



package Java_Dsa.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class addingOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = arr.size();
          arr.add(25);
        arr.add(1);
        arr.add(9);
        arr.add(9);
        // arr.add(4);
        int carry=1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            // if(arr.get(i)+carry<=9){
            //     ans.add(arr.get(i)+carry);
            //     carry=0;

            // } else{//means the sum  is 10
            //     ans.add(0);
            //     carry=1;
            // }
            int sum = arr.get(i)+carry;
            ans.add(sum%10);
            carry=sum/10;
          } // if(carry==1) ans.add(1);
        if(carry>0){
            ans.add(carry);
        }
    
    Collections.reverse(ans);
    System.out.println(ans);
}
}

