public class Mixed107{
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int n = nums.length;
        int first = robHouse(nums,0,n-2);
        int last = robHouse(nums,1,n-1);
        return Math.max(first,last);
    }
    public static int robHouse(int nums[],int start, int end){
        int prev1=0;
        int prev2 = 0;
        for(int i=start;i<=end;i++){
            int curr = Math.max(prev1,prev2+nums[i]);
            prev2  =prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        Mixed107 sol = new Mixed107();
        int nums[]={1,2,3,1};
        System.out.println(sol.rob(nums));
    }
}