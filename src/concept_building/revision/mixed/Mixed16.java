public class Mixed16{
    public static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr = Math.max(curr+nums[i],nums[i]);
            maxSum = Math.max(maxSum,curr);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}