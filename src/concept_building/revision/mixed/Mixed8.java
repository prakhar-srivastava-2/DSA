
import java.util.Arrays;

public class Mixed8{
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
        //op => [12, 14, 11, 13, 10]
        int res[] = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
        }
        int left = sum;
        for(int i = 0;i<nums.length;i++){
            res[i] = left-nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}