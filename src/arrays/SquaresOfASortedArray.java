
import java.util.Arrays;

public class SquaresOfASortedArray{
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        //op => [0, 1, 9, 16, 100]
        int result[] = new int[nums.length];
        int i=0;
        int j = nums.length-1;
        int k = nums.length-1;
        while(i<=j){
            if((nums[i]*nums[i])>(nums[j]*nums[j])){
                result[k] = nums[i]*nums[i];
                i++;
            }
            else{
                result[k] = nums[j]*nums[j];
                j--;
            }
            k--;

        }
        // while(i<=j){
        //     result[i] = nums[i]*nums[i];
        //     result[j] = nums[j]*nums[j];
        //     i++;
        //     j--;
        //     //[16,1,0,9,100]
        // }
        // i=0;
        // j=result.length-1;
        // while(i<j){
        //     if(result[i]<result[j]){
        //         j--;

        //     }
        //     else{
        //         int temp = result[i];
        //         result[i]  =result[j];
        //         result[j] = temp;
        //         // i++;
        //     }
        // }
        System.out.println(Arrays.toString(result));
    }
}