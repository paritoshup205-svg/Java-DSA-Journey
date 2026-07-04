package Java_Dsa.Sorting;
import java.util.Arrays;
public class twoSum {
    public static void main(String[] args) {
        int [] arr = {7,0,4,3,2,8,10};
        int x =9;
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==x){
                System.out.println("Indexes are" + " " + i + " " +j);
                break;
            }
             if (sum>x) {
                j--;
            }  
            if (sum<x) {
                i++;
            }
            
        }
    }
}
