
import java.util.HashMap;

public class Mixed58{
    public static int subarraysDivByK(int[] nums, int k){
        int c=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remainder = ((sum%k)+k)%k;
            if(map.containsKey(remainder)){
                c+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);

        }
        return c;
    }
}