public class Mixed68{
    public static int maxSubArray(int[] nums) {
        int maxL= Integer.MIN_VALUE;
        // int sum=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            maxL = Math.max(maxL,curr);
            if(curr<0){
                curr=0;
            }
        }
        return maxL;
    }

    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}