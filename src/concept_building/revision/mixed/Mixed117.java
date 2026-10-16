public class Mixed117{
    public static int uniquePaths(int m, int n){
        int t[][] = new int[m+1][n+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0 ||j==0){
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                t[i][j] = t[i-1][j]+t[i][j-1];
            }
        }
        System.out.println("m = " + m + ", n = " + n);
        return t[m-1][n-1];
    }
    public static void main(String[] args) {
        int m=3;
        int n=7;
        System.out.println(uniquePaths(m, n));
    }
}