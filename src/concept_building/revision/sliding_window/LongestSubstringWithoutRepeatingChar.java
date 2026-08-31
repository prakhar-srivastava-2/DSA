
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar{
    public static void main(String[] args) {
        String s = "abcabcbb";
        //op=>3
        Set <Character> result = new HashSet<>();
        int maxLength = Integer.MIN_VALUE;
        int i = 0;

        for(int j = 0;j<s.length();j++){
            char c = s.charAt(j);
            while(result.contains(c)){
                result.remove(s.charAt(i));
                i++;
            }
            result.add(c);
            int window = j-i+1;
            maxLength = Integer.max(window, maxLength);

        }
        System.out.println(maxLength);
    }
}