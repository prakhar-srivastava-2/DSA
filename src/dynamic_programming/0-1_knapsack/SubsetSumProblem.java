public class SubsetSumProblem{
    public static boolean isSubset(int arr[],int target){
        boolean t[][] = new boolean[arr.length+1][target+1];
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
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[arr.length][target];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,8,10};
        int k = 11;
        System.out.println(isSubset(arr, k));
    }
}