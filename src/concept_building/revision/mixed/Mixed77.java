
import java.util.HashSet;
import java.util.Set;

public class Mixed77{
    public static int lengthOfLongestSubstring(String s){
        int i=0;
        int maxL = 0;
        Set<Character>set = new HashSet<>();
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            // set.add(c);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            int len = j-i+1;
            maxL = Math.max(maxL, len);
            set.add(c);
        }
        return maxL;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}