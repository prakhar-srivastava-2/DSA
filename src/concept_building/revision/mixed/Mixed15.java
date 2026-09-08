public class Mixed15{

    public static boolean twoSum(int[] nums, int target){
        int i = 0;
        int j = nums.length -1;
        boolean isSum = false;

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                isSum = true;
                return isSum;
            }
            else if (sum<target){
                i++;
            }
            else{
                j--;
            }

        }
        return isSum;
    }
    public static void main(String[] args) {
        int [] nums = {-4, -1, 0, 2, 5, 7};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }
}