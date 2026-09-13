import java.util.HashSet;
import java.util.Set;

public class Mixed25{
    //Input:  [100, 4, 200, 1, 3, 2]
// Output: 4
    public static int longestCommonSubsequence(int nums[]){
        Set<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int num = nums[i];
                int currLen =1;
                while(set.contains(num+1)){
                    num++;
                    currLen++;
                }
                maxLen = Math.max(maxLen,currLen);
            }
        }


        return maxLen;
    }
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestCommonSubsequence(nums));
    }
}