
import java.util.HashSet;
import java.util.Set;

public class Mixed82{
    public static int longestConsecutive(int[] nums){
        int maxCount=0;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=1;
                int current = nums[i];
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }


    public static void main(String[] args) {

        int nums[] = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }
}
