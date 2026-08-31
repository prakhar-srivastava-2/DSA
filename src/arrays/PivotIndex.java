public class PivotIndex{
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        //op-> 3
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int sum=0;
        int rSum = 0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            left[i] = sum;
        }

        for(int i=0;i<nums.length;i++){
            rSum+=nums[i];
            right[nums.length - i -1] = rSum;
        }

        int length = nums.length - 1;
        while(length>0){
            if(left[length]==right[length]){
                System.out.println(length);
                return;
            }
            length--;
        }
        System.out.println("no index");
    }

    /*** OPTIMISED
     * int leftSum = 0;

    for (int i = 0; i < nums.length; i++) {

        int rightSum = total - leftSum - nums[i];

        if (leftSum == rightSum) {
            System.out.println(i);
            return;
        }

        leftSum += nums[i];
    }
     *
     */
}