
import java.util.ArrayList;
import java.util.List;

public class PrefixSum{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        //output-> [1, 3, 6, 10, 15]
        List<Integer>answer = new ArrayList<>();
        int sum = 0;

        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            answer.add(i, sum);
        }
        System.out.println(answer);
    }
}