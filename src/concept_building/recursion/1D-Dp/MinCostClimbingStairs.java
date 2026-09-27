public class MinCostClimbingStairs{
    public static void main(String[] args) {

    int[] cost = {10, 15, 20};

    int result = minCostClimbingStairs(cost);

    System.out.println(result);
}
    public static int minCostClimbingStairs(int cost[]){
        int dp[] = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = cost[0];
        for(int i=2;i<=cost.length;i++){
            dp[i] = cost[i-1] + Math.min(dp[i-1],dp[i-2]);
        }
        return dp[cost.length];
    }
}