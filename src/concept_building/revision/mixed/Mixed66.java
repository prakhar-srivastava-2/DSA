public class Mixed66{
    public static int stockSell(int nums[]){
       int maxProfit = 0;
       int first = nums[0];
       for(int i=0;i<nums.length;i++){
            first = Math.min(first,nums[i]);
            int profit = nums[i] - first;
            maxProfit = Math.max(maxProfit,profit);
       }
       return maxProfit;
    }

    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stockSell(nums));
    }
}