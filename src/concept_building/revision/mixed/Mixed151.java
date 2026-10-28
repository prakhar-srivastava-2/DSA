
import java.util.HashMap;
import java.util.Map;

public class Mixed151{
    public static int subarraySum(int[] nums, int k) {
    // Your solution
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int preSum=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int tar = preSum - k;
            if(map.containsKey(tar)){
                count+=map.get(tar);
            }
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, -1, 0};
        int k = 0;
        System.out.println(subarraySum(nums, k));
    }
}