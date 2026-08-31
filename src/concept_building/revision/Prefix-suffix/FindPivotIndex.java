public class FindPivotIndex{
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        //op=>3
        int sum = 0;
        int res[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
            // [1,8,11,17,22,28]
        }
        int right=0;
        for(int i=nums.length - 1;i>=0;i--){
            res[i] = res[i] - (nums[i]+right);
            right+=nums[i];
            if (res[i]==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println("pivot index not found");
    }
}