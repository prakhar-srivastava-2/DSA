public class Mixed12{
    public static void main(String[] args) {
        int[] nums = {-5, -2, 1, 3, 4, 7, 10};
        int target = 6;
        // op=> true
        for(int k =0;k<nums.length-2;k++){
            int i = k+1;
            int j = nums.length-1;
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }

            while(i<j){
                int sum = nums[k]+nums[i]+nums[j];
                if(target==sum){
                        System.out.println("true");
                        return;
                    }


                else if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }



        }
        System.out.println("false");
    }
}