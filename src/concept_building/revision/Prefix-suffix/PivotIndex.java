

public class PivotIndex{
    public static void main(String[] args) {
        int []nums = {1, 7, 3, 6, 5, 6};
        //op=>3
        int lSum = 0;
        int rSum = 0;
        // int res[] = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     lSum+=nums[i];
        //     res[i] = lSum;
        //     //[1, 8, 11, 17, 22, 28]
        // }
        // // System.out.println(Arrays.toString(nums));
        // // System.out.println(lSum);
        // for(int i=nums.length-1;i>=0;i--){
        //     //28-6-0=22;
        //     // 22-6-5 =11
        //     // 17-6-11
        //     int sub = res[i] - (nums[i]+rSum);
        //     if (sub==0){
        //         System.out.println(i);
        //         return;
        //     }
        //     rSum = rSum+nums[i];
        // }

        for(int i=0;i<nums.length;i++){
            lSum = lSum+nums[i];
            if(lSum==rSum){
                System.out.println(i+1);
                return;
            }
            rSum = rSum+nums[nums.length-1 - i];

        }
    }
}