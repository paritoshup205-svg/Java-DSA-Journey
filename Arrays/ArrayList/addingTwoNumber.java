// {3,5,7,9} + {9,2,1} = {4,4,9,0}


package Java_Dsa.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class addingTwoNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
          arr.add(5);
        arr.add(1);
        arr.add(9);
        arr.add(9);

        ArrayList<Integer> arr2 = new ArrayList<>();
        //   arr.add(5);
        arr2.add(1);
        arr2.add(4);
        arr2.add(9);

        ArrayList<Integer> ans = new ArrayList<>();

        int carry=0;
       int i=arr.size()-1;
       int j=arr2.size()-1;
       while(i>=0||j>=0||carry>0){
        int sum=carry;
        if(i>=0){
            sum+=arr.get(i);
            i--;
        }
         if(j>=0){
            sum+=arr2.get(j);
            j--;
        }
        ans.add(sum%10);
        carry=sum/10;
       }
        Collections.reverse(ans);
        System.out.print(ans);

        
    }
}
