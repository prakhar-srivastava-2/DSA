public class Mixed13{
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //p => 2
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        for (int j =0;j<nums.length;j++){
            sum = sum+nums[j];
            while(sum>=target){
                int window = j-i+1;
                minSum = Math.min(minSum,window);
                sum = sum-nums[i];
                i++;
            }

        }
        System.out.println(minSum);
    }
}