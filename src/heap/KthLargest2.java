
import java.util.PriorityQueue;

public class KthLargest2{
    public static int kth(int nums[],int k){
        PriorityQueue<Integer>heap = new PriorityQueue<>();
        // heap.offer(nums[0]);
        for(int i=0;i<nums.length;i++){
                if(heap.size()<k){
                    // heap.poll();
                    heap.offer(nums[i]);
                }
                else if(nums[i]>heap.peek()){
                    heap.poll();
                    heap.offer(nums[i]);
                }
            }

        return heap.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(kth(nums, k));
    }
}