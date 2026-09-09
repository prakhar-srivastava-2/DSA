public class Mixed17{
    public static int minSubArrayLen(int target, int[] nums){
        int i = 0;
        int sum = 0;
        int minSum= Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                int window = j-i+1;
                minSum = Integer.min(minSum,window);
                sum = sum-nums[i];
                i++;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}