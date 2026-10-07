public class CoinChange1{
    public static int maxWays(int coins[], int sum){
        int t[][] = new int[coins.length+1][sum+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0){
                    t[i][j] = 0;
                }
                if(j==0){
                    t[i][j] = 1;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(coins[i-1]<=j){
                    t[i][j] = (t[i][j-coins[i-1]]+t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[coins.length][sum];
    }
    public static void main(String[] args) {
        int coins[] ={1,2,3};
        int sum = 5;
        System.out.println(maxWays(coins, sum));
    }
}