
import java.util.Arrays;

public class SuffixSum{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        //op-> [15, 14, 12, 9, 5]
        int res[] = new int[nums.length];
        int sum = 0;
        for(int i=nums.length -1;i>=0;i--){
            sum+=nums[i];
            res[i] = sum;
        }
        System.out.println(Arrays.toString(res));
    }
}