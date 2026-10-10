public class Mixed102{
    public static int rob(int[] nums) {
    // Your solution
    int n = nums.length;
    int t[] = new int[n+1];
    t[0] = 0;
    t[1] = nums[0];
    t[n] = 0;
    for(int i=2;i<n;i++){
        t[i] = Math.max(t[i-1],t[i-2]+nums[i-1]);
    }
    return t[n-1];
}
public static void main(String[] args) {
    int nums[] = {1,2,3};
    System.out.println(rob(nums));
}
}