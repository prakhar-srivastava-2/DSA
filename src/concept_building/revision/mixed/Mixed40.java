
import java.util.HashMap;

public class Mixed40{
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                int length = i - map.get(sum-k);
                maxLength = Integer.max(maxLength,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarray(nums, k));
    }
}
