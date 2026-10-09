
import java.util.HashSet;
import java.util.Set;

public class Mixed99{
    public static int longestSS(String s){
        Set<Character>set = new HashSet<>();
        int maxL = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char c  =s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            int l = j-i+1;
            maxL = Math.max(maxL,l);
        }
        return maxL;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longestSS(s));
    }
}