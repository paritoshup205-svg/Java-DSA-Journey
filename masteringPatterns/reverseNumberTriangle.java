package Java_Dsa.masteringPatterns;

import java.util.Scanner;

public class reverseNumberTriangle {
     public static void main(String[] args) {
        System.out.println("Enter the number n: ");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        char ch = 'A';
        int num = 1;
        // 1
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64) +" " );
            }
            System.out.println();
        }
        System.out.println();

    //2
    for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j +" " );
            }
            System.out.println();
        }

    System.out.println();
    
    //3
    for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1-i);j++){
                System.out.print(i+" " );
            }
            System.out.println();
        }
        System.out.println();

    //4
   for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1-i);j++){
                if(i%2!=0){
                    System.out.print((char)(i+64) + " ");
                } else System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println();
        
    //5
     for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(ch+ " ");
                } else {
                    System.out.print(num+ " ");
                }
                
            }if(i%2!=0){
                    ch++;
                } else num++;
            System.out.println();}
        System.out.println();

    //6
    for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print((2*j-1)+ " ");
                }
                System.out.println();
            }
        }
    }
