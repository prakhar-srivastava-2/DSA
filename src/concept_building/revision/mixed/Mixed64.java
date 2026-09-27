
import java.util.HashMap;

public class Mixed64{
    public static int longArray(int nums[],int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxL = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                int len = i - map.get(sum-k);
                maxL = Math.max(maxL,len);
            }
            else if(!map.containsKey(sum)){
            map.put(sum,i);
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        int nums[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longArray(nums, k));
    }
}