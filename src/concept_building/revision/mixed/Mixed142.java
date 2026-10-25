
// import java.util.HashMap;

// public class Mixed142{
//     public static int subarraySum(int[] nums, int k) {
//     // Your code here
//     HashMap<Integer,Integer>map = new HashMap<>();
//     int maxC=0;
//     for(int i=0;i<nums.length;i++){
//         int c=0;
//         int sum = k-nums[i];
//         while(map.containsKey(sum)){
//             c++;
//             maxC = Math.max(maxC,c);
//         }
//         if(!map.containsKey(nums[i])){
//             map.put(nums[i],k);
//         }
//     }
//     return maxC;
//     }
// }


import java.util.HashMap;
import java.util.Map;

public class Mixed142 {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int required = prefixSum - k;

            if (map.containsKey(required)) {
                count += map.get(required);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -2, 2};
        int k = 3;

        System.out.println(subarraySum(nums, k)); // Output: 4
    }
}