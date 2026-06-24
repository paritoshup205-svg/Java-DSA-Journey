package Java_Dsa.Basics;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        System.out.println("Enter the Numbers");
        Scanner ss = new Scanner(System.in);
        double p = ss.nextDouble();
        double q = ss.nextDouble();
        double r = ss.nextDouble();
        if(p>q && p>r){
            System.out.println(p+ " is the greatest integer");
        } else if(q>p && q>r){
            System.out.println(q+ " is the greatest integer");
        }
        else if(r>p && r>q){
            System.out.println(r+ " is the greatest integer");
        }

    }
}