public class Mixed147{
    public static int minCoinRequired(int coins[],int amount){
        int t[][] = new int[coins.length+1][amount+1];
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
        int ans = t[coins.length][amount];
        return ans>=Integer.MAX_VALUE-1?-1:ans;
    }
    public static void main(String[] args) {
        int coins[] = {2};
        int amount = 3;
        System.out.println(minCoinRequired(coins, amount));
    }
}