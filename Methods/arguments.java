package Java_Dsa.Methods;

public class arguments {
    public static int sum(int a, int b , int c, int d){
        // System.out.println(Math.max(a,b),Math.max(c,d)));
        return (Math.max(Math.max(a,b),Math.max(c,d)));
    }
    public static void main(String[] args) {
        sum(9,4,13,1);
        System.out.println("Learning return");
        System.out.println(sum(19,24,13,17));
    }
    
}
