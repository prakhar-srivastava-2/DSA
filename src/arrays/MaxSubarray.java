
import static java.lang.Integer.max;

public class MaxSubarray{
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // output -> 6
        if (arr.length==0){
            System.out.println("0");

        }
        if (arr.length==1){
            System.out.println(arr[0]);
        }
        if (arr.length>1){
            int maxSum = Integer.MIN_VALUE;
            int curr = 0;
            for(int i = 0;i<arr.length;i++){
                curr= max(curr+arr[i],arr[i]);
                maxSum = max(maxSum, curr);

            }
            System.out.println(maxSum);
        }
    }
}