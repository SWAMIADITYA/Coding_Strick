import java.util.Arrays;

public class Day6 {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4,5};
        int ans = removeDuplicates(nums);

        System.out.println("non duplicates numbers is :"+ans);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] arr){

        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        } 

        return i+1;
    }
}
