public class PrintLCSubsequence{
    public static String printLCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int t[][] = new int[n+1][m+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        String l = "";
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                l+=s1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(t[i-1][j]>t[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
        }
        String ans = "";
        for(int x=l.length()-1;x>=0;x--){
            ans+=l.charAt(x);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(printLCS(s1, s2));
    }
}