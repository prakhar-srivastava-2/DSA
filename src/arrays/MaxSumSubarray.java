

public class MaxSumSubarray{
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        // int t=0;
        // int maxSum = Integer.MIN_VALUE;
        // // int left=0;
        // int sumo=0;
        // for(int left=0;left<arr.length;left++){
        //     t=left;
        //     int x = 0;
        //     while(x<k){
        //         sumo = sumo+arr[t];
        //         maxSum=Integer.max(sumo,maxSum);
        //         t++;
        //     }
        // }
        // System.out.println(maxSum);

        int sum = 0;
        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum = sum;
        for(int i=k; i<arr.length;i++){
            sum = sum - arr[i-k] + arr[i];
            maxSum = Integer.max(sum,maxSum);
        }
        System.out.println(maxSum);

    }
}