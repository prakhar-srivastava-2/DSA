public class SumOfElementsBetweenIndexes{
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};
        int sum = 0;
        int out=0;
        int n=3;
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            res[i] = sum;
        }
        while (n>0){
        int L=1;
        int R=3;
        if(L==0){
            out = res[R];
        }
        else{
            out = res[R] - res[L-1];
        }
        System.out.println(out);
        n--;
        }
    }
}