package Java_Dsa.masteringPatterns;
import java.util.Scanner;
public class reverseRightTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number n: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// for(int  i =1;i<=n;i++){
//     for(int j=1;j<=(n+1-i);j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// for(int i=n;i>=1;i--){
//             for(int j=n;j>=1;j--){
//                 System.out.print("* ");
//             }
//             n--;
//             System.out.println();
//         }