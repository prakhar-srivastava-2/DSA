public class Mixed122{
    public static int minCostClimbingStair(int nums[]){
        int t[] = new int[nums.length+1];
        t[0] = 0;
        t[1] = 0;
        for(int i=2;i<t.length;i++){
            t[i] = Math.min(t[i-1]+nums[i-1],t[i-2]+nums[i-2]);
        }
        return t[nums.length];
    }
    public static void main(String[] args) {
        int nums[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStair(nums));
    }
}