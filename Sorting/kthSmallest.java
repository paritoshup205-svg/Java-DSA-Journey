package Java_Dsa.Sorting;
import  java.util.Scanner;
public class kthSmallest {
    public static void main(String[] args) {
        Scanner ss =  new Scanner(System.in);
        System.out.println("Enter the kth number");
        int k = ss.nextInt();
        System.out.println("Enter the size of the array");
        int n = ss. nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = ss.nextInt();
        }

        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int minI = -1;
            for(int j=i;j<n;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minI = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
           
        }
         System.out.println(arr[k-1]);
        
    }
}
