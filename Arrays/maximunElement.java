package Java_Dsa.Arrays;
import java.util.Scanner;
public class maximunElement {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n = ss.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Elements of the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ss.nextInt();
        }

        int  m = 0;
        for (int j = 0; j < arr.length; j++) {
            if(m<arr[j]){
                m = arr[j];
            }
        } System.out.println("Maximum element in the array is: " + " " + m);
    }
}
