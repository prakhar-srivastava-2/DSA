public class Mixed98{
    public static int maxSum(int nums[]){
        int n = nums.length;
        int t[] = new int[n+1];
        t[0] = 0;
        t[1] = nums[0];
        for(int i=2;i<t.length;i++){
            t[i] = Math.max(t[i-1],t[i-2]+nums[i-1]);
        }
        return t[n];
    }
    public static void main(String[] args) {
        int nums[] = {2, 7, 9, 3, 1};
        System.out.println(maxSum(nums));
    }
}