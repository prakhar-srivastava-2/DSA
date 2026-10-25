public class Mixed144{
    public int rob(int[] nums){
        int t[] = new int[nums.length+1];
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        t[0] = 0;
        t[1] = nums[0];
        for(int i=2;i<t.length;i++){
            t[i] = Math.max(t[i-1],t[i-2]+nums[i-1]);
        }
        return t[nums.length];
    }
    public static void main(String[] args) {
        Mixed144 solution = new Mixed144();

        int[] nums = {2, 7, 9, 3, 1};

        int result = solution.rob(nums);

        System.out.println(result); // Expected output: 12
    }
}