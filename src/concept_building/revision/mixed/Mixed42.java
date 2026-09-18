
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Mixed42{
    public static int[] maxFreq(int nums[],int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer>heap = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(Map.Entry<Integer,Integer>mp : map.entrySet()){
            if(heap.size()<k){
                heap.offer(mp.getKey());
            }
            else if(map.get(heap.peek())<mp.getValue()){
                heap.poll();
                heap.offer(mp.getKey());
            }
        }
        int result[] = new int[k];
        for(int i=k-1;i>=0;i--){
            result[i] = heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]={4,4,4,4,5,5,5,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(maxFreq(nums, k)));
    }
}