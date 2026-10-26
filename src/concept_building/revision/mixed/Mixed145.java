
import java.util.HashMap;
import java.util.Map;

public class Mixed145{
    public static boolean subarraySum(int nums[],int target){
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        int counter=0;
        for(int i=0;i<nums.length;i++){
            counter++;
            sum+=nums[i];
            int rem = sum-target;
            if(rem%target==0 && counter>1){
                return true;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        for(Map.Entry<Integer,Integer>mp: map.entrySet()){
            if(mp.getValue()>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,8};
        int t = 10;
        System.out.println(subarraySum(nums, t));
    }
}