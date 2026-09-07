public class Mixed10{
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 5, 4, 2};
        int k = 3;
        //op=>6
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        minSum = Math.min(minSum,sum);
        for(int i =k;i<nums.length;i++){

            sum = sum + nums[i] - nums[i-k];
            minSum = Math.min(minSum,sum);
        }
        System.out.println(minSum);
    }
}