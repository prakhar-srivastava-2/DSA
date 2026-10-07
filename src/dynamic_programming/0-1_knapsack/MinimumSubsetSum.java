
import java.util.ArrayList;
import java.util.List;

public class MinimumSubsetSum{
    public static int minSum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        boolean t[][] = new boolean[arr.length+1][sum+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
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
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        List<Integer>num = new ArrayList<>();
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==arr.length && t[i][j]==true){
                    num.add(j);
                }
            }
        }
        int minCount = Integer.MAX_VALUE;
        for(int i=0;i<num.size();i++){
            if(num.get(i)<=sum/2){
            minCount = Math.min(minCount,sum - (2*(num.get(i))));
            }
        }
        return minCount;
    }
    public static void main(String[] args) {
        int nums[] = {1,6,11,5};
        System.out.println(minSum(nums));
    }
}