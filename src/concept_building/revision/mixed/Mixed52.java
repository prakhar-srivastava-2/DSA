
import java.util.PriorityQueue;

public class Mixed52{
    public static int kthLargest(int nums[],int k){
        PriorityQueue<Integer>heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(heap.size()<k){
                heap.offer(nums[i]);
            }
            else if(heap.peek()<nums[i]){
                heap.poll();
                heap.offer(nums[i]);
            }
        }
        return heap.peek();
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(kthLargest(nums, k));
    }
}