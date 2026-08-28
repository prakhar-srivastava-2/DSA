
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter{
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxWindow = Integer.MIN_VALUE;
        //output->3
        Set<Character> result = new HashSet<>();
        if (s.length()==0){System.out.println("0"); return;}
        if (s.length()==1){System.out.println("1"); return;}
        int i=0;
        for(int j = 0;j<s.length();j++){
            char c = s.charAt(j);
            while(result.contains(c)){
                result.remove(s.charAt(i));
                i++;
            }
            result.add(c);
            int window = j-i+1;
            maxWindow = Integer.max(maxWindow,window);
        }
        System.out.println(maxWindow);
    }
}
