package Java_Dsa.Basics;

import java.util.Scanner;

public class threedigitnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a>99 && a<1000){
            System.out.println("Yes,the number contains three digits");
        }
        else if(a<100){
            System.out.println("the number contains 2 digits");
    }
    else if(a>1000){
        System.out.println("the number contains more than three digits");
    }
}
}
