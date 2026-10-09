public class Mixed97{
    public static int minLen(int nums[],int target){
        int minL = Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                // i++;
                int l = j-i+1;
                i++;
                minL = Math.min(minL,l);

            }
        }
        return minL;
    }
    public static void main(String[] args) {
        int  nums[]={2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minLen(nums, target));
    }
}