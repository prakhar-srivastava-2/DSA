public class Mixed30{
    public static int ones(int nums[]){
        int i=0;
        int maxOne = Integer.MIN_VALUE;
        int zeroCount = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                zeroCount++;
            }
            while(zeroCount>1){
            if(nums[i]==0){
                zeroCount--;
            }
            i++;
        }
        maxOne = Math.max(maxOne, j - i);
        }
        return maxOne;
    }

    public static void main(String[] args) {
        int nums[]={1,1,0,1};
        System.out.println(ones(nums));
    }
}
