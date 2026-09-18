
import java.util.PriorityQueue;

public class Mixed41{
    public static int kthMax(int nums[],int k){
        PriorityQueue<Integer>heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(heap.size()<k){
                heap.offer(nums[i]);
            }
            else if(!heap.isEmpty() && heap.peek()<nums[i]){
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int nums[] = {7, 10, 4, 3, 20, 15};
        int k=3;
        System.out.println(kthMax(nums, k));
    }
}