public class LongestSubarrayWithSumLessThanK{
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 7;
        //op=>3
        int i=0;
        int sum=0;
        int maxS = Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>k){
                sum=sum-nums[i];
                i++;
            }
            int window = j-i+1;
            maxS=Integer.max(maxS,window);
        }
        System.out.println(maxS);
    }
}