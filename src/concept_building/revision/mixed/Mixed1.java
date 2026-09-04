public class Mixed1{
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum = Integer.max(sum,maxSum);
        for (int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum = Integer.max(sum, maxSum);
        }
        System.out.println(maxSum);
    }
}