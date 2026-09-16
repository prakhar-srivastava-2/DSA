
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement{
    public static int kthLargest(int nums[], int k){
        PriorityQueue<Integer>heap = new PriorityQueue<>(Collections.reverseOrder());
        int val=0;
        for(int i=0;i<nums.length;i++){
            heap.offer(nums[i]);
        }
        for(int i=0;i<k;i++){
            val = heap.poll();
        }
        return val;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(kthLargest(nums, k));
    }

}