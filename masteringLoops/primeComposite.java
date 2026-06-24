package Java_Dsa.masteringLoops;

import java.util.Scanner;

public class primeComposite {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = ss.nextInt();
        boolean isComposite = true; //true means the values is prime
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isComposite = false; //false means the value is commposite
                break;
            }
            }
            if(n==1){
                System.out.println("The numnber is neither prime nor composite");
            }
            else if(isComposite==true){
                System.out.println("the number is Prime number");
            } else System.out.println("The number is a composite number");
        }
    }
