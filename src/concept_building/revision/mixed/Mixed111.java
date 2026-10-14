
import java.util.HashSet;
import java.util.Set;

public class Mixed111{
    public int lengthOfLongestSubstring(String s) {
        int maxL = 0;
        Set<Character>set = new HashSet<>();
        int i=0;
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            int l = j-i+1;
            maxL = Math.max(maxL,l);
            set.add(c);
        }
        return maxL;
    }
    public static void main(String[] args) {
        Mixed111 sol = new Mixed111();
        String s = "pwwkew";
        System.out.println(sol.lengthOfLongestSubstring(s));
    }
}