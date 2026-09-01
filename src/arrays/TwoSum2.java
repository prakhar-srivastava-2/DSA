public class TwoSum2{
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //op=> Pair found: 2, 7
        int i=0;
        int j = nums.length - 1;
        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum==target){
                System.out.printf("Pair Found: %d, %d",nums[i],nums[j]);
                return;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }

        }
        System.out.println("No pair found");
    }
}