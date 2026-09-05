public class Mixed6{
    public static void main(String[] args) {
        int[] nums = {-5, -2, -1, 0, 3, 6, 9};
        boolean isSolved = false;
        int target = 400;
        int i =0;
        int j =nums.length-1;

        while(i<j){
            int sum = nums[i]+nums[j];
            if (sum==target && nums[i]!=nums[j]){
                isSolved = true;
                System.out.println(isSolved);
                return;
            }
            else if (sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(isSolved);
    }
}