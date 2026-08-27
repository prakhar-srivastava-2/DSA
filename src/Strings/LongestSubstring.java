
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring{
    public static void main(String[] args) {
        String s="abcabcd";
        int bestMax=0;
        if(s.length()==1){
            System.out.println("1");
            return;
        }
        if (s.length()==0){
            System.out.println("0");
            return;
        }
        Set<Character>visited = new HashSet<>();
        int left = 0;
        for(int right=0;right<s.length();right++){
            char element = s.charAt(right);
            while(visited.contains(element)){

                visited.remove(s.charAt(left));
                left++;
            }
            visited.add(element);
            int currLength = right - left +1;
            bestMax = Integer.max(currLength, bestMax);
        }
        System.out.println(bestMax);
    }
}