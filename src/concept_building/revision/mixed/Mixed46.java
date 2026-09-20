
import java.util.HashMap;
public class Mixed46{
    public static int longestSubarray(int[] nums, int k){
        int maxL = 0;
        int sum=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
        for(int j=0;j<nums.length;j++){
            sum = sum+nums[j];
            if(map.containsKey(sum-k)){
                int length = j - map.get(sum-k);
                maxL = Math.max(maxL,length);
            }
            if(!map.containsKey(sum)){
            map.put(sum,j);
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(longestSubarray(nums, k));
    }
}