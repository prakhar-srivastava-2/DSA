
import java.util.Arrays;

public class Mixed19{
    public static int[] product(int[] nums){
        int res[] = new int[nums.length];
        int left = 0;
        for(int i=0;i<nums.length;i++){
            left+=nums[i];
            res[i] =left;
        }
        //[3, 4, 8, 10, 15]
        int right = 0;
        for(int i = nums.length-1;i>=0;i--){
            res[i] = (res[i]+right) - nums[i];
            right = right+nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        //op=> [12, 14, 11, 13, 10]
        System.out.println(Arrays.toString(product(nums)));
    }
}