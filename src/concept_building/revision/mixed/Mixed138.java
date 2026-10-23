
import java.util.Arrays;

public class Mixed138{
    public int[] twoSum(int[] numbers, int target){
        int i=0;
        int j=numbers.length-1;
        int res[] = new int[2];
        if(numbers.length<=1){
            return numbers;
        }
        while(i<j){
            int s = numbers[i]+numbers[j];
            if(s==target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            else if(s<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Mixed138 sol = new Mixed138();
        int nums[]={-1,0};
        int t = -1;
        int res[] = sol.twoSum(nums, t);
        System.out.println(Arrays.toString(res));

    }
}