
import java.util.LinkedHashMap;
import java.util.Map;

public class Mixed23{
    public static int once(int nums[]){
        //Input:  [4, 5, 1, 2, 0, 4, 1, 5]
        // Output: 2
        LinkedHashMap<Integer,Integer>freq = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer>res : freq.entrySet()){
            if(res.getValue()==1){
                return res.getKey();
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int nums[]={4, 5, 1, 2, 0, 4, 1, 5};
        System.out.println(once(nums));
    }
}