package Java_Dsa.Arrays.MultiDimensional_Arrays;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number of rows n");
        int n = ss.nextInt();
        System.out.println("Enter the number of colums m");
        int m = ss.nextInt();
        int [][] arr = new int [n][m];


          for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 arr[i][j] = ss.nextInt();
            }
            // System.out.println();
        }
        int sum = 0;
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum +=arr[i][j];
            }
        }
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}
