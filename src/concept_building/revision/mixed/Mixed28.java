
import java.util.HashMap;
import java.util.Map;

public class Mixed28{
    public static int element(int nums[]){
        int len = (nums.length)/2;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>mp: map.entrySet()){
            if(mp.getValue()>len){
                return mp.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        System.out.println(element(nums));
    }
}