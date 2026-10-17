public class Mixed119{
    public static int rob(int[] nums) {
    // Your code
        int t[] = new int[nums.length+1];
        t[0] = 0;
        t[1] = nums[0];
        for(int i=2;i<t.length;i++){
            t[i] = Math.max(t[i-1],t[i-2]+nums[i-1]);
        }
        return t[nums.length];
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(rob(nums));
    }
}