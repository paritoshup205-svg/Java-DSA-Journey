package Java_Dsa.Arrays;

public class fourDivisors {
    public static void main(String[] args) {
        int [] arr = {21,4,7};
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int divisors=0;
            int count=0;
            for (int j = 1; j <= arr[i]; j++) {
                if(arr[i]%j==0){
                    divisors+=j;
                    count++;
                }
            }
            if(count==4){
                ans+=divisors;
            }
        } System.out.println(ans);
    }
}
