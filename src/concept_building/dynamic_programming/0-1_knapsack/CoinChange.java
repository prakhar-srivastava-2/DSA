public class CoinChange{
    public static int minCoin(int coins[],int amount){
        int n = coins.length;
        int t[][] = new int[n+1][amount+1];
        for(int i=0;i<t.length;i++){
            for(int j = 0;j<t[i].length;j++){
                if(j==0){
                    t[i][j] = 0;
                }
                else if(i==0){
                    t[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(coins[i-1]<=j){
                    t[i][j] = Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][amount]>=Integer.MAX_VALUE-1?-1:t[n][amount];
    }
    public static void main(String[] args) {
        int coins[] ={1,2,5};
        int amount = 11;
        System.out.println(minCoin(coins, amount));
    }
}