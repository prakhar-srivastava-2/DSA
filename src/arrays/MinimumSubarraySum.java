public class MinimumSubarraySum{
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int i=0;
        int minSum = Integer.MAX_VALUE;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                int window = j-i+1;
                minSum = Integer.min(minSum,window);
                sum=sum-nums[i];
                i++;
            }

        }
        System.out.println(minSum);
    }
}