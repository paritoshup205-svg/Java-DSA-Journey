package Java_Dsa.Arrays;

public class PassingArrayToMwthods {
    public static void main(String[] args) {
        int x[] = {10,20,30,40,50};
        int y[]={22,44,55,66,77};
        System.out.println(x[3]);
        System.out.println(y[3]);
        change(y,x);
        System.out.println(x[3]);
        System.out.println(y[3]);
    }

    public static void change(int[] y,int[] x){
         y[3] = 230;
         x[3] = 20;
    }
}
