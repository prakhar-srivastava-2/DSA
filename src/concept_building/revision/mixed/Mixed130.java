public class Mixed130{
    public static int findMin(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int l = 0;
        int h = nums.length-1;
        return findMinimum(nums,l,h);
    }
    public static int findMinimum(int nums[],int l,int h){
        if(l==h){
            return nums[l];
        }
        int m = l +(h-l)/2;
        if(nums[m]>nums[h]){
            return findMinimum(nums, m+1, h);
        }
        else{
            return findMinimum(nums, l, m);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {11, 13, 15, 17};
        int[] nums2 = {3, 4, 5, 1, 2};
        int[] nums3 = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMin(nums1)); // 11
        System.out.println(findMin(nums2)); // 1
        System.out.println(findMin(nums3)); // 0
    }
}