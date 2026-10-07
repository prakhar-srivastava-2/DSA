public class CoinChange2{
    public static int minCoin(int coins[], int sum){
        int t[][] = new int[coins.length+1][sum+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0){
                    t[i][j] = Integer.MAX_VALUE-1;
                }
                if(j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int j=0;j<t[0].length;j++){
            if(j%coins[0]==0){
                t[1][j] = j/coins[0];
            }
            else{
                t[1][j] = Integer.MAX_VALUE-1;
            }
        }
        for(int i=2;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(coins[i-1]<=j){
                    t[i][j] = Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[coins.length][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int sum = 11;
        System.out.println(minCoin(coins, sum));
    }
}