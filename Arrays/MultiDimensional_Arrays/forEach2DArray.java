package Java_Dsa.Arrays.MultiDimensional_Arrays;

public class forEach2DArray {
    public static void main(String[] args) {
         int [][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        //   for(int i =0;i<arr.length;i++){
        //     for(int ele:arr[i]){
        //         System.out.print(ele+" ");
        //     }
        //     System.out.println();
        //   }

        for(int []a:arr){ //we selected 1d array from the given 2d arrays 
            for(int ele:a){ //then wrote the element from that 1d array
                System.out.print(ele+" ");
            }
            System.out.println();
          }
    }
}
