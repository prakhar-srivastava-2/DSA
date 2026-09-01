
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4};
        //op-=>k = 4
            // First k elements = [1, 2, 3, 4]
        int i=0;
        int count = 1;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                count+=1;
                // nums[i] = nums[j];
                i++;
                nums[i]=nums[j];
            }
        }

        System.out.printf("k = %d\n",count);
        System.out.println(Arrays.toString(Arrays.copyOf(nums,count)));

    }
}