import java.util.HashSet;
import java.util.Set;

public class Mixed34{
    public static int longestUniqueSubarray(int[] nums) {
    // your code
    int maxCount = 0;
    int i=0;
    Set<Integer>set = new HashSet<>();
    for(int j=0;j<nums.length;j++){
        while(set.contains(nums[j])){
            set.remove(nums[i]);
            i++;
        }
            set.add(nums[j]);

        int c = j-i+1;
        maxCount = Math.max(maxCount,c);

    }
    return maxCount;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,1,4};
        System.out.println(longestUniqueSubarray(nums));
    }
}
