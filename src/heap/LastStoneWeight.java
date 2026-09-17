
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight{
    public static int weight(int nums[]){
        PriorityQueue<Integer>queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            queue.offer(nums[i]);
        }
        if(queue.isEmpty()){
            return 0;
        }
        if(queue.size()<=1){
            return queue.peek();
        }
        while(queue.size()>1){
            int x = queue.poll();
            int y = queue.poll();
            if(x!=y){
                queue.offer(x-y);
            }
        }
        if(!queue.isEmpty()){
            return queue.peek();
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {10, 4, 10, 3, 7};
        System.out.println(weight(nums));
    }
}