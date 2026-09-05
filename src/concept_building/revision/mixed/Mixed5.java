
import java.util.Arrays;

public class Mixed5{
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        //op=>[27, 19, 9, 0, 11, 22]

        int res[] = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
            // res = > [1,8,11,17,22,28]=>[6,11,17,20,27,28]
        }

        int right = 0;
        for(int i=0;i<nums.length;i++){
            right=right+nums[i];
            res[i] = Math.abs(sum - right);
            sum = sum - nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
