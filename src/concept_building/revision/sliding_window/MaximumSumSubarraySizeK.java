public class MaximumSumSubarraySizeK{
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k]+nums[i];
            maxSum = Integer.max(maxSum,sum);
        }
        System.out.println(maxSum);

    }
}