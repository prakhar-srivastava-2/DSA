
import java.util.HashMap;

public class Mixed49{
    public static int subarray(int nums[],int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        int sum=0;
        int maxL = 0;
        map.put(0,-1);
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(map.containsKey(sum-k)){
                int len = j-map.get(sum-k);
                maxL = Math.max(maxL,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,j);
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        int nums[]={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(subarray(nums, k));
    }
}