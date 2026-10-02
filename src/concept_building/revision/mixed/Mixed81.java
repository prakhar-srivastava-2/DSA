public class Mixed81{
    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = search(nums, target);

        System.out.println(result);
    }

    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        return searching(nums, target, low, high);
    }

    public static int searching(int[] nums, int target,int l,int h){
        if(l > h){
            return -1;
        }
        int mid = (int) (l+h)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return searching(nums,target,mid+1,h);
        }
        else if(nums[mid]>target){
            return searching(nums, target, l, mid-1);
        }
        return -1;
    }

}