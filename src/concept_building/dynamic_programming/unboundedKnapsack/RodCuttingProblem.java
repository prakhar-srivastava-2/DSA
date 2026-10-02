public class RodCuttingProblem{
    public static int rodCut(int prices[],int length){
        int t[][] = new int[prices.length+1][length+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(i<=j){
                    t[i][j] = Math.max(prices[i-1] + t[i][j-i], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[prices.length][length];
    }
    public static void main(String[] args) {
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int len = 8;
        System.out.println(rodCut(prices, len));
    }
}