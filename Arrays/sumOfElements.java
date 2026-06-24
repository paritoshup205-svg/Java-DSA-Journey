package Java_Dsa.Arrays;
import java.util.Scanner;
public class sumOfElements {
  public static void main(String[] args) {
      Scanner ss = new Scanner(System.in);
    int n = ss.nextInt();
    int []  arr = new int[n];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = ss.nextInt();
    } 
    System.out.println();
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    System.out.println("Sum of elemetns is"+ " " +sum);
  }
}
