public class MaximumSubarraySizeK{
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        //output->9
        int sum = 0;
        int maxSum;
        for(int i =0;i<k;i++){
            sum+=arr[i];
        }
        maxSum = sum;

        for(int i=k;i<arr.length;i++){
            sum = sum+arr[i] - arr[i-k];
            maxSum = Integer.max(sum,maxSum);
        }
        System.out.println(maxSum);
    }
}