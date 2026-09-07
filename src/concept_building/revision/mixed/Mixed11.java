
import java.util.Arrays;

public class Mixed11{
    public static void main(String[] args) {
        int[] nums = {5, 7, 1, 9, 3, 8};
        //op => [1512, 1080, 7560, 840, 2520, 945]
        int res[] = new int[nums.length];
        int lProd = 1;
        for(int i=0;i<nums.length;i++){

            res[i] = lProd;
            lProd = lProd*nums[i];
        }
        //[1, 5, 35, 35, 315, 945]
        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i]*right;
            right = right*nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}