package Java_Dsa.Arrays.MultiDimensional_Arrays;

public class minElementOfRow {
    public static void main(String[] args) {
        int [][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};

        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int maxElement = Integer.MIN_VALUE;
            for (int j = 0; j < arr[i].length; j++) {
                if(maxElement<arr[i][j]){
                    maxElement = arr[i][j];
                }
            }
            if(minElement>maxElement){
                minElement = maxElement;
            }
        }
        System.out.println(minElement);
    }
}
