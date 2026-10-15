public class Mixed113{
    public int rob(int[] nums){
        int t[] = new int[nums.length+1];
        t[0] = 0;
        t[1] = nums[0];
        for(int i=2;i<t.length;i++){
            t[i] = Math.max(t[i-1],t[i-2]+nums[i-1]);
        }
        return t[nums.length];
    }
    public static void main(String[] args) {
        Mixed113 sol = new Mixed113();
        int nums[] = {2, 7, 9, 3, 1};
        System.out.println(sol.rob(nums));
    }
}