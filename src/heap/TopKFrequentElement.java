
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement{
    public static int[] frequent(int nums[],int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer>heap = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        int result[] = new int[k];
        for(Map.Entry<Integer,Integer>mp: map.entrySet()){
            if(heap.size()<k){
                heap.offer(mp.getKey());
            }
            else if(map.get(heap.peek())<mp.getValue()){
                heap.poll();
                heap.offer(mp.getValue());
            }
        }
        for(int i=0;i<k;i++){
            int x = heap.poll();
            result[i] = x;
        }
        return result;
        }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(frequent(nums, k)));
        }
}