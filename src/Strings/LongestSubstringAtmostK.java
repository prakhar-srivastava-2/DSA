
import java.util.HashMap;

public class LongestSubstringAtmostK{
    public static void main(String[] args) {
        String s = "abcabc";
        int k  = 2;
        int i = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j = 0;j<s.length();j++){
            char current = s.charAt(j);
            map.put(current,map.getOrDefault(current,0)+1);
            while (map.size()>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                map.remove(s.charAt(i));
                }
                i++;
            }
            int length = j-i+1;
            maxLength = Integer.max(length,maxLength);

        }
        System.out.println(maxLength);
    }
}