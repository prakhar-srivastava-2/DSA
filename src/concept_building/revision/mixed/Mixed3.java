public class Mixed3{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 8, 9};
        int target = 20;
        int i=0;
        int j = nums.length -1;
        boolean isEqual = false;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                isEqual = true;
                System.out.println(isEqual);
                return;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(isEqual);
    }
}