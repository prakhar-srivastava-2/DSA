
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement{
    public static int[] nextGreater(int[] nums) {
        int res[] = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(res,-1);
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int index = stack.pop();
                res[index] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[]  = {2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(nextGreater(nums)));
    }
}