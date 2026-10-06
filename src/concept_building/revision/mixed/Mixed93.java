
import java.util.HashSet;
import java.util.Set;

public class Mixed93{
    public static int lengthOfLongestSubstring(String s){
        int i=0;
        int maxL = 0;
        Set<Character>set = new HashSet<>();
        for(int j=0;j<s.length();j++){
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            int l = j-i+1;
            maxL = Math.max(l, maxL);
        }
        return maxL;
    }
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}