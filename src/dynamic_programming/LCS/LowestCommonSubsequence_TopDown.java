public class LowestCommonSubsequence_TopDown{
    public static int longestCommonSubsequence(String s1, String s2) {
        int t[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]  = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
String s2 = "GXTXAYB";

        System.out.println(longestCommonSubsequence(s1, s2));

    }

}