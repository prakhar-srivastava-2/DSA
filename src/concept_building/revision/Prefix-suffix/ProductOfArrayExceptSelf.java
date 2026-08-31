
import java.util.Arrays;

public class ProductOfArrayExceptSelf{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int output[] = new int[nums.length];
        //op=> [24, 12, 8, 6]
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            output[i] = prod;
            prod*=nums[i];
        }
        //[1,1,2,6]
        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            output[i] = right*output[i];
            right*=nums[i];
        }
        System.out.println(Arrays.toString(output));
    }
}