
import java.util.HashMap;

public class LongestSubstringContainingAtmostK{
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        //op=>3
        HashMap<Character,Integer>result = new HashMap<>();
        int maxLength = 0;
        int i=0;
        for(int j= 0;j<s.length();j++){
            char c = s.charAt(j);
            result.put(c,result.getOrDefault(c, 0)+1);
            while(result.size()>k){
                result.put(s.charAt(i),result.getOrDefault(s.charAt(i), 0)-1);
                if(result.get(s.charAt(i))==0){
                    result.remove(s.charAt(i));
                }
                i++;
            }

            int window = j-i+1;
            maxLength = Integer.max(maxLength,window);
        }
        System.out.println(maxLength);

    }
}