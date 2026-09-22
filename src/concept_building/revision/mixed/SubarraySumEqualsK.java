
import java.util.HashMap;

public class SubarraySumEqualsK{
    public static void main(String[] args) {

    int[] nums = {1, 1, 1};
    int k = 2;

    int result = subarraySum(nums, k);

    System.out.println("Number of subarrays: " + result);
}

    public static int subarraySum(int nums[], int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        int sum=0;
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }

        return count;
    }
}