package Java_Dsa.Arrays.MultiDimensional_Arrays;

import java.util.Scanner;

public class rowWithMaxSum {
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
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;
            for (int i = 0; i < n; i++) {
                int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum +=arr[i][j];
            }
            if(maxSum<rowSum){
                maxSum = rowSum;
                rowIndex = i;
        }
    }
    System.out.println(maxSum +" "+ "Row index =" + " " + rowIndex);
    }
}
