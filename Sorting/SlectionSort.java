package Java_Dsa.Sorting;
import java.util.Scanner;
public class SlectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int min=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                arr[j]=min;
                j++;
            }
            System.out.println(arr[j]);
        } 

    }
    
}
