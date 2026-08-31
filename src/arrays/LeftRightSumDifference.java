
import java.util.Arrays;

public class LeftRightSumDifference{
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        //op=> [15, 1, 11, 22]
        int res[] = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;

            //res=>[10,14,22,25]
        }
        int right = 0;
        for(int i=nums.length - 1;i>=0;i--){
            res[i] = Math.abs((res[i] - (nums[i] + right)));
            right = right+nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}