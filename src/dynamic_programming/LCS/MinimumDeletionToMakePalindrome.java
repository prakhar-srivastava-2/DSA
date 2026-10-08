public class MinimumDeletionToMakePalindrome{
    public static int minDeletionsToMakePalindrome(String s){
        StringBuilder sc = new StringBuilder(s);
        String x = sc.reverse().toString();
        int n = s.length();
        int t[][] = new int[n+1][n+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0||j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(s.charAt(i-1)==x.charAt(j-1)){
                    t[i][j]= 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return n - t[n][n];
    }
    public static void main(String[] args) {
        String s = "aebcbda";
        System.out.println(minDeletionsToMakePalindrome(s));
    }
}