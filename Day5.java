public class Day5 {
    public static void main(String[] args){
        int[] arr = {3,1,3,4,2};

        int ans = findDuplicate(arr);
        System.out.println(" duplicate element in the given array is :"+ans);
    }

    public static int findDuplicate(int[] nums){

        int[] arr = new int[nums.length+1];

        for(int i=0; i<nums.length; i++){
            if(arr[nums[i]]==1){
                return nums[i];
            }else{
                arr[nums[i]]++;
            }
        }

        return 0;

    }
}
