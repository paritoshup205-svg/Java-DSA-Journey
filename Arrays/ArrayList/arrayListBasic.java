package Java_Dsa.Arrays.ArrayList;

import java.util.ArrayList;

public class arrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(29);
        System.out.println(arr.get(2));
        arr.set(3,22);
        System.out.println(arr.get(3));
        System.out.println(arr);

    }
}
