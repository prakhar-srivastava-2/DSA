
import java.util.HashSet;
import java.util.Set;

public class Mixed94{
    public static int longestConsecutive(int[] nums){
        Set<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int maxC = 0;
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int count=1;
            if(!set.contains(current-1)){
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
            }
            maxC = Math.max(maxC, count);
        }
        return maxC;
    }
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}