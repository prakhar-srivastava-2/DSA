public class Mixed96{
    public static int minCostClimbingStairs(int[] cost){
        int t[] = new int[cost.length+1];
        t[0] = 0;
        t[1] = 0;
        for(int i=2;i<=cost.length;i++){
            t[i] = Math.min(cost[i-1]+t[i-1],cost[i-2]+t[i-2]);
        }
        return t[cost.length];
    }
    public static void main(String[] args) {
        int cost[] = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }
}