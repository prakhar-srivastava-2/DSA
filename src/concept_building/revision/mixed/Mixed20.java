public class Mixed20{
    public static boolean hasPairWithSum(int[] nums, int target){
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 8, 16};
        int target  = 10;
        System.out.println(hasPairWithSum(nums, target));
    }
}