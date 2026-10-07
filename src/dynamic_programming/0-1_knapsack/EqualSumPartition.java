public class EqualSumPartition{
    public static boolean isEqual(int nums[]){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target = sum/2;
        boolean t[][] = new boolean[nums.length+1][target+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0){
                    t[i][j] = false;
                }
                if(j==0){
                    t[i][j] = true;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(nums[i-1]<=j){
                    t[i][j] = t[i-1][j-nums[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[nums.length][target];
    }
    public static void main(String[] args) {
        int nums[] = {3,5,11,5};
        System.out.println(isEqual(nums));
    }
}