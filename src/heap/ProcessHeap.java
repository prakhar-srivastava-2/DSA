
import java.util.PriorityQueue;

public class ProcessHeap{
    public static int processQueue(int[] nums) {
    // your code
    int sum=0;
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for(int i=0;i<nums.length;i++){
        heap.offer(nums[i]);
    }
    if(heap.size()<2){
        return 0;
    }
    for(int i=0;i<2;i++){
        sum+=heap.poll();
    }
    return sum;
}

    public static void main(String[] args) {
        int[] nums = {5, 1, 8, 3, 2};
        System.out.println(processQueue(nums));
    }
}