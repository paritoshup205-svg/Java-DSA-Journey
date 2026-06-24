package Java_Dsa.Arrays;
import java.util.Scanner;
public class outputIInputArray {
    public static void main(String[] args) {
//         int[] x = {5,-8,9,10,-11};
//         for(int i=0;i<x.length;i++){
//             System.out.print(x[i]+ " ");
//         } System.out.println("");
//         System.out.println("Length of5
//  the array is" + " " +x.length);



Scanner ss = new Scanner(System.in);
System.out.println("Enter the size of an Array: ");
int n = ss.nextInt();
System.out.println("Enter the elements of an Array: ");
int [] arr = new int[n];
for(int i=0;i<arr.length;i++){
    // int x = ss.nextInt();
    // arr[i] = x;
    arr[i] = ss.nextInt();
}



// given an array, print negative elements only
for(int i=0;i<arr.length;i++){
    if(arr[i]<0){
        System.out.println(arr[i] + " ");
    }
}

}
}
