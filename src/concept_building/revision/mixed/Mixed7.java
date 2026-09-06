public class Mixed7{
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum=0;
        float avg;
        float maxAvg = Float.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg =  sum/3;
        maxAvg = Math.max(maxAvg,avg);

        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            avg = (float) sum/k;
            maxAvg = Math.max(maxAvg,avg);
        }
        System.out.println(maxAvg);
    }
}