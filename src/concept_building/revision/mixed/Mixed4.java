public class Mixed4{
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int MinSize = Integer.MAX_VALUE;
        int i = 0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                sum = sum-nums[i];
                int window = j-i+1;
                MinSize = Integer.min(MinSize, window);
            i++;
            }
        }
        System.out.println(MinSize);
    }
}