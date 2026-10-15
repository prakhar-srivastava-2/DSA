
import java.util.HashSet;
import java.util.Set;

public class Mixed114{
    public int longestConsecutive(int[] nums){
        Set<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxC = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=1;
                int c = nums[i];
                while(set.contains(c+1)){
                    count++;
                    c++;
                }
                maxC = Math.max(maxC,count);
            }
        }
        return maxC;
    }
    public static void main(String[] args) {
        Mixed114 sol = new Mixed114();
        int nums[]={1, 0, 1, 2};
        System.out.println(sol.longestConsecutive(nums));
    }
}