package Java_Dsa.Arrays;
import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ss.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr [i] = ss.nextInt();
        }
        int m = arr.length;
        int i =0 , j=m-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }

    }
}
