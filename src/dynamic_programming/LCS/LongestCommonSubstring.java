public class LongestCommonSubstring{
    public static int longestCommonSubstring(String s1, String s2) {
        int t[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        int max=0;
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[i].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                    max = Math.max(max, t[i][j]);

                }
                else{
                    t[i][j] = 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s1 = "ABABC";
        String s2 = "BABCA";
        System.out.println(longestCommonSubstring(s1, s2));
    }
}