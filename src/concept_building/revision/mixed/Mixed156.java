public class Mixed156{
    public static int search(int[] nums, int target){
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int l=0;
        int h=nums.length-1;
        int m = l+(h-l)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[l]<=nums[m]){
            if(nums[l]<=target && target<nums[m]){
                return binaryS(nums,target,l,m-1);
            }
            else{
                return binaryS(nums,target,m+1,h);
            }
        }
        else{
            if(nums[m]<=target && target<nums[h]){
                return binaryS(nums,target,m+1,h);
            }
            else{
                return binaryS(nums,target,l,m-1);
            }
        }
        // return -1;
    }
    public static int binaryS(int nums[],int target,int l,int h){
        if(l>h){
            return -1;
        }
        int m = l+(h-l)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[m]<target){
            return binaryS(nums, target, m+1, h);
        }
        if(nums[m]>target){
            return binaryS(nums, target, l, m-1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}