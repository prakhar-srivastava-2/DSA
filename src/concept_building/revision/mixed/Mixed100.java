public class Mixed100{
    public static int subarraySum(int[] nums, int k) {
    int maxS = 0;
    int i=0;
    int sum=0;
    for(int j=0;j<nums.length;j++){
        sum+=nums[j];
        while(sum!=k){
            sum-=nums[i];
            i++;
        }
        int l=j-i+1;
        maxS = Math.max(l, maxS);
    }
    return maxS;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        int k=3;
        System.out.println(subarraySum(nums, k));
    }

}