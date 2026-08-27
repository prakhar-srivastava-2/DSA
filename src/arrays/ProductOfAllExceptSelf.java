
import java.util.ArrayList;
import java.util.List;

public class ProductOfAllExceptSelf{

    public static void main(String[] args) {
       int nums[] = {1,2,3,4};
       List<Integer> answer = new ArrayList<>();
       int leftP = 1;
       for(int i = 0;i<nums.length;i++){
        answer.add(i,leftP);
        leftP = leftP*nums[i];
       }
       int rightP = 1;
       for(int i = nums.length - 1;i>=0;i--){
        answer.set(i,rightP*answer.get(i));
        rightP = rightP* nums[i];
       }
        System.out.println(answer);
       }
}