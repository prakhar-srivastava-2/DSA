public class MinimumLengthSubarraySumAtleastK{
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int k = 7;
        int sum=0;
        int minSum = Integer.MAX_VALUE;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum = sum+nums[j];
            while(sum>=k){
                int window = j-i+1;
                minSum=Integer.min(minSum, window);
                sum=sum-nums[i];
                i++;
            }

        }
        System.out.println(minSum);
    }
}