
import java.util.HashSet;
import java.util.Set;

public class Mixed44{
    public static int noRepeat(int nums[]){
        Set<Integer>set = new HashSet<>();
        int i=0;
        int maxL = 0;
        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            int length = j-i+1;
            maxL = Math.max(maxL, length);
        }
        return maxL;
    }
    public static void main(String[] args) {
        int nums[]={1, 2, 3, 1, 2, 4};
        System.out.println(noRepeat(nums));
    }
}