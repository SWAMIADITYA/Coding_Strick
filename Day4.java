import java.util.*;
public class Day4 {
    public static void main(String[] args){
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50}; int m=7;
        Arrays.sort(arr);
        int ans = chocklets(arr, m);
        System.out.println("the minimum difference is :"+ ans);
    }

    public static int chocklets(int[] arr, int m){
        
        int min_diff = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            int nextWindow = i+m-1;
            if(nextWindow >= arr.length){
                break;
            }

            if(arr[nextWindow]- arr[i] < min_diff){
                min_diff = arr[nextWindow] - arr[i];
            }
            
        }

        return min_diff;
    }
}
