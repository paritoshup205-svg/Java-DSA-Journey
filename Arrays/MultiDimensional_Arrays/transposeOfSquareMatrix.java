package Java_Dsa.Arrays.MultiDimensional_Arrays;

public class transposeOfSquareMatrix {
    public static void main(String[] args) {
        int [][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};

         for(int [] a : arr){
                for(int ele: a){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }


            System.out.println();
            System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr[0].length; j++) {
        //         if(i!=j){
        //             int temp = arr[i][j];
        //             arr[i][j] = arr[j][i];
        //             arr[j][i] = temp;
        //         }
        //     }
        // }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }



        for(int [] a : arr){
            for(int ele: a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
