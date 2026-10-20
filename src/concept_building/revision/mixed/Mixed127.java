public class Mixed127{
    public static int searchRotated(int nums[],int target){
        int l = 0;
        int h = nums.length-1;
        int m = l + (h-l)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[l]<=nums[m]){
            if(nums[l]<=target && target<=nums[m]){
                return search(nums,l,m,target);
            }
            else{
                return search(nums, m+1, h, target);
            }
        }
        else{
            if(nums[m]<=target && target<=nums[h]){
                return search(nums, m, h, target);
            }
            else{
                return search(nums,l,m-1,target);
            }

        }
    }

    public static int search(int nums[],int l,int h,int t){
        if(l>h){
            return -1;
        }
        int m = (int) (l+h)/2;
        if(nums[m]==t){
            return m;
        }
        if(nums[m]<t){
            return search(nums,m+1,h,t);
        }
        if(nums[m]>t){
            return search(nums,l,m-1,t);
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={6,7,1,2,3,4,5};
        int t = 7;
        System.out.println(searchRotated(nums, t));
    }
}