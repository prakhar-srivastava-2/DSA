public class Mixed2{
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        //op=> 3
        int left = 0;
        int right;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            right = sum - left - nums[i];
            if(right==left){
               System.out.println(i);
               return;
            }
            left+=nums[i];

        }
        System.out.println("pivot not found");

    }
}
