public class Mixed104{
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        // if(n==0){
        //     return nums[0];
        // }
        int one = robHouse(nums,0,n-2);
        int two  =robHouse(nums,1,n-1);
        return Math.max(one,two);
    }

    public static int robHouse(int nums[],int first,int last){
        int prev1=0;
        int prev2 = 0;
        for(int i=first;i<=last;i++){
            int current = Math.max(prev1,prev2+nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
    Mixed104 solution = new Mixed104();

    int[] nums1 = {2, 3, 2};
    System.out.println(solution.rob(nums1)); // Expected: 3

    int[] nums2 = {1, 2, 3, 1};
    System.out.println(solution.rob(nums2)); // Expected: 4

    int[] nums3 = {1, 2, 3};
    System.out.println(solution.rob(nums3)); // Expected: 3

    int[] nums4 = {5};
    System.out.println(solution.rob(nums4)); // Expected: 5

    int[] nums5 = {1, 2};
    System.out.println(solution.rob(nums5)); // Expected: 2
}
}