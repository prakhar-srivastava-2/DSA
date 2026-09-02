
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;

            }
            int i = k+1;
            int j = nums.length-1;

            while(i<j){
                int sum = nums[k]+nums[i]+nums[j];
                if(sum==0){
                    result.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    i++;
                    j--;

                    //skipping duplicate on left
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }

                    //skipping duplicate on right;
                    while(i<j && nums[j]==nums[j+1]){
                        j--;
                    }
                }
                else if(sum<0){
                    i++;
                }
                else{
                    j--;
                }
            }

        }
        System.out.println(result);
    }
}