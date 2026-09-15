
import java.util.HashSet;
import java.util.Set;
public class Mixed32{
    public static int LCS(int nums[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int maxL = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int curr = nums[i];
                int currL=1;
                while(set.contains(curr+1)){
                    currL++;
                    curr++;
                }
                maxL = Math.max(maxL, currL);
            }
        }
        return maxL;
    }

    public static void main(String[] args) {
        int nums[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(LCS(nums));
    }
}