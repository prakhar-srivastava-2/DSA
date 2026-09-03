public class ContigousArrayOfSize3{
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 4, 5, 6};
        //op=>true
        //[3,4,5]
        // average = 4

        int k = 3;
        int avg=10;
        int sum=0;
        int i=0;
        for(int j=0;j<k;j++){
            sum+=nums[j];
        }
        for(int j=k;j<nums.length;j++){
            int average = sum/k;
            if(average==avg){
                System.out.println("true");
                return;
            }
            sum = sum + nums[j] - nums[i];
            i++;
        }
        System.out.println("false");
    }
}