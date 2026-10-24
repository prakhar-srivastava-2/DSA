
import java.util.HashSet;
import java.util.Set;

public class Mixed141{
    public static int longestConsecutive(int[] nums){
        if(nums.length==0){
            return 0;
        }
        Set<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxC = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count=1;
                int c = nums[i];
                while(set.contains(c+1)){
                    c++;
                    count++;
                }
                maxC = Math.max(count, maxC);
            }
        }
        return maxC;
    }
    public static void main(String[] args) {
        int nums[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}