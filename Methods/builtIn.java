package Java_Dsa.Methods;
import java.util.Scanner;
public class builtIn {
    public static void main(String[] args) {
        // System.out.println(Math.cbrt(125));
        // System.out.println(Math.sqrt(4));
        // System.out.println(Math.PI);
        // System.out.println(Math.abs(-45));
        // System.out.println(Math.floor(-7.8)); //floor - gretest integer function. floor of an apartment 7.8 lies between -7 and -8 for -7.8 the floor will be 8
        
        // System.out.println(Math.ceil(-7.8));
        // System.out.println(Math.min(3, 9));
        // System.out.println(Math.max(129, 498));

        Scanner ss = new Scanner(System.in);
        System.out.print("Enter a,b and c : ");
        int a = ss.nextInt();
        int b = ss.nextInt();
        int c = ss.nextInt();
        int d = ss.nextInt();
        System.out.println(Math.max(Math.max(a,d),Math.max(b,c)));
    }
}
