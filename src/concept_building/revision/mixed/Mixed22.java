
import java.util.HashMap;

public class Mixed22{
    public static int longestZeroSumSubarray(int[] nums){
        //nums = [15, -2, 2, -8, 1, 7, 10, 23]
        //op=>5
        HashMap<Integer,Integer>sum = new HashMap<>();
        int add = 0;
        int maxLength = 0;
        int length;
        sum.put(0,-1);
        for(int i=0;i<nums.length;i++){
            add+=nums[i];
            if(sum.containsKey(add)){
                length = i - sum.get(add);
                maxLength = Math.max(length,maxLength);
            }
            else{
            sum.put(add,i);
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(longestZeroSumSubarray(nums));
    }
}