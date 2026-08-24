
import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class StockSelling{


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = Integer.MIN_VALUE;
        int len = prices.length;
        int min = prices[0];
        for(int i=0;i<len;i++){
            if (min<prices[i]){
                int p = prices[i] - min;
                profit = max(p,profit);
                min = min(min, prices[i]);
            }
        }
        System.out.println(profit);
    }
}
// -----------------------------------------------------
    // this is o(n*n)

    //     int i = 0;
    //     if(len<=1){
    //         profit = 0;
    //         System.out.println(profit);
    //         return;
    //     }
    //     for(i=0;i<prices.length;i++){
    //         int j =i+1;
    //     while (i<j && j<len){
    //         if(prices[i]<prices[j]){
    //             int p = prices[j] - prices[i];
    //             profit = max(profit, p);
    //             j++;
    //         }
    //         else{
    //             j++;
    //         }
    //     }
    //     }
    //     System.out.println(profit);


