
//------------------------ARRAY LEARNING--------------------------------//
import java.util.*;
public class Day2 {
    public static void main(String[] args) {

        int[] rolls = new int[] {1,2,3,4,5,6};
      // System.out.println(rolls[4]);

    //    int[][] twod = new int[3][];
    // int[][] arr = {{1,2,3},
    //                 {4,5,6},
    //                 {7,8,9}};

                    //simple for lopp method 
    // for(int i=0; i<arr.length; i++){
    //     for(int j=0; j<arr[i].length; j++){
    //         System.out.print(arr[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // tostring method
    // for(int i=0; i<arr.length; i++){
    //     System.out.println(Arrays.toString(arr[i]));
    // }

    // for each loop

    // for(int[] a : arr){
    //     System.out.println(Arrays.toString(a));
    // }


    //------------------------questions start here-------------------------------//

    // Q1. swap
    // System.out.println(Arrays.toString(rolls));
    // swap(rolls, 2,3);
    // System.out.println(Arrays.toString(rolls));

    //Q2. maximum value

    // int[] num = {54,163,152,2013,89};
    //     System.out.println(maxValue(num));

    // Q3. reverse arrray
    System.out.println(Arrays.toString(rolls));
        reverse(rolls);
        System.out.println(Arrays.toString(rolls));
        
    }

    public static void swap(int[] arr, int indx1, int indx2){
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }

    public static int maxValue(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void reverse(int[] arr){

        int start=0;
        int end = arr.length-1;

        while(start<=end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
