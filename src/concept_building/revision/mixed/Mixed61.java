
import java.util.HashMap;

public class Mixed61{
    public static int longest(int nums[], int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxL = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                int l = i - map.get(sum-k);
                maxL = Math.max(l,maxL);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxL;
    }
    public static void main(String[] args) {
        int nums[] = {2, -2, 4, -1, -3, 5, 1};
        int k=3;
        System.out.println(longest(nums, k));
    }
}