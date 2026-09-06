public class Mixed9{
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 4};
        int target = 4;
        int i = 0;
        int j = nums.length-1;
        boolean isThere = false;
        while(i<j){
            int sum = nums[i] + nums[j];
            if (sum==target){
                isThere = true;
                System.out.println(isThere);
                return;
            }
            else if (sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(isThere);
    }
}