
import java.util.Arrays;

public class Mixed139{
    public int[] productExceptSelf(int[] nums){
        int res[] = new int[nums.length];
        if(nums.length==1){
            return res;
        }
        int l = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = l;
            l = l*nums[i];
        }
        //{1,1,2,6}
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = r*res[i];
            r = r*nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        //op->[24, 12, 8, 6];
        Mixed139 sol = new Mixed139();
        System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
    }
}