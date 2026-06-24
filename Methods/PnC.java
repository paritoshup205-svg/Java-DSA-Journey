package Java_Dsa.Methods;
import java.util.Scanner;
public class PnC {
   public static int pnc(int n){
        // Scanner ss = new Scanner(System.in);
        // System.out.print("Enter n & r: ");
        //  int n = ss.nextInt();
        //  int r = ss.nextInt();
        int factorialOfn = 1;
        for(int i = 1;i<=n;i++){
            factorialOfn*=i;
        }
        return factorialOfn; }
       
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the value of n & r: ");
         int n = ss.nextInt();
         int r = ss.nextInt();

         System.out.println("Combination of the given numbers are" +" "+ pnc(n)/(pnc(r)*pnc(n-r)));

        System.out.println("Permutation of the given numbers are" +" " +pnc(n)/pnc(n-r));
    }
}
