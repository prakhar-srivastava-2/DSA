
import java.util.HashSet;
import java.util.Set;

public class Mixed137{
    public int lengthOfLongestSubstring(String s){
        Set<Character>set = new HashSet<>();
        int maxS = 0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            int l = j-i+1;
            maxS = Math.max(maxS,l);
        }
        return maxS;
    }
    public static void main(String[] args) {
        Mixed137 sol = new Mixed137();
        String s = "pwwkew";
        System.err.println(sol.lengthOfLongestSubstring(s));

    }
}