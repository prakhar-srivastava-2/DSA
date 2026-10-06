
import java.util.Arrays;

public class Mixed91{
    public static int[] productExceptSelf(int[] nums){
        int res[] = new int[nums.length];
        int l=1;
        for(int i=0;i<nums.length;i++){
            res[i] = l;
            l = l*nums[i];
        }

        int r = 1;
        for(int i=res.length-1;i>=0;i--){
            //[24, 12, 8, 6]
            res[i] = r*res[i];
            r = r*nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}