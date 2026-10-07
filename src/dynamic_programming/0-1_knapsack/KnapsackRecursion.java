
import java.util.Arrays;

public class KnapsackRecursion{
    static int t[][];

    public static int knapsack(int wt[],int val[],int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(t[n][W]!=-1){
            return t[n][W];
        }
        if(wt[n-1]<=W){
            t[n][W]= Math.max(val[n-1]+ knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }
        else if(wt[n-1]>W){
            t[n][W]= knapsack(wt, val, W, n-1);
        }
        return t[n][W];
    }
    public static void main(String[] args) {
        int wt[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int W  = 7;
        t = new int[val.length+1][W+1];
        for (int[] t1 : t) {
            Arrays.fill(t1, -1);
        }
        System.out.println(knapsack(wt, val, W, val.length));

    }
}