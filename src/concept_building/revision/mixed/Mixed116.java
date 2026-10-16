public class Mixed116{
    public static int search(int[] nums, int target){
        int l = 0;
        int h=nums.length-1;
        int m = (int)(l+h)/2;
        if(nums[l]<=nums[m]){
            if(nums[l]<=target && target<=nums[m]){
                return binaryS(nums,l,m,target);
            }
            else{
                return binaryS(nums, m+1, h, target);
            }
        }
        else{
            if(nums[m]<=target && target<=nums[h]){
                return binaryS(nums, m, h, target);
            }
            else{
                return binaryS(nums, l, m-1, target);
            }
        }
    }
    public static int binaryS(int nums[],int l,int h,int target){
        if(l>h){
            return -1;
        }
        int m = (int)(l+h)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[m]<target){
            return binaryS(nums, m+1, h, target);
        }
        if(nums[m]>target){
            return binaryS(nums, l, m-1, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3,1};
        int target = 1;
        System.out.println(search(nums, target));
    }
}