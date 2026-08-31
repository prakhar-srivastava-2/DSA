
import java.util.Arrays;

public class ProductExceptSelf{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //op=> [24, 12, 8, 6]
        int res[]=new int[nums.length];
        int left = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = left;
            left=left*nums[i];
            // [1,1,2,6]
        }
        int right=1;
        for(int i=nums.length - 1;i>=0;i--){
            res[i] = res[i]*right;
            right=right*nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}