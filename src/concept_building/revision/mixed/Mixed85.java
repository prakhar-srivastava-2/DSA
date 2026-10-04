
import java.util.Arrays;

public class Mixed85{
    public static int[] productExceptSelf(int[] nums){
        int res[] = new int[nums.length];
        int x = 1;
        for(int i=0;i<res.length;i++){
            res[i] = x;
            x = x*nums[i];
        }
        int y = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = y*res[i];
            y = y*nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
//         Input:  [1,2,3,4]   [1,1,2,6]
// Output: [24,12,8,6]
    int nums[] = {1,2,3,4};
    System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}