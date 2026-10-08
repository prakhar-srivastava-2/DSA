public class MinimumInsertionAndDeletionToConvertStringAtoStringB{
    public static int minInsertDelete(String a, String b){
        int n = a.length();
        int m = b.length();
        int t[][] = new int[n+1][m+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int del = n - t[n][m];
        int ins = m-t[n][m];
        return del+ins;
    }
    public static void main(String[] args) {
        String a = "heap";
        String b = "pea";
        System.out.println(minInsertDelete(a, b));
    }
}