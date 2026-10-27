
import java.util.HashSet;
import java.util.Set;

public class Mixed148{
    public static int longestConsecutive(int[] nums) {
    // Your solution
        Set<Integer>set  = new HashSet<>();
        int maxC=0;
        for(int s:nums){
            set.add(s);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int c = nums[i];
                int count=0;
                while(set.contains(c)){
                    count++;
                    c++;
                }
                maxC = Math.max(maxC, count);
            }
        }
        return maxC;
    }
    public static void main(String[] args) {
        int nums[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}