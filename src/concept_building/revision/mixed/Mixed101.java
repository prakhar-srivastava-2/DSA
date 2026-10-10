
import java.util.HashSet;
import java.util.Set;

public class Mixed101{
    public static int longestConsecutive(int[] nums) {
    // Your solution
    Set<Integer>set = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }
    int maxC = 0;
    for(int i=0;i<nums.length;i++){
        int curr = nums[i];
        if(!set.contains(curr-1)){
            int count=1;
            while(set.contains(curr+1)){
                count++;
                curr++;
            }
            maxC = Math.max(maxC, count);
        }
    }
    return maxC;

    }

    public static void main(String[] args) {
        int nums[]={0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}