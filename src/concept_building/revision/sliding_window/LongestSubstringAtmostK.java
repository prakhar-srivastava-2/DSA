
import java.util.HashMap;

public class LongestSubstringAtmostK{
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        int maxSum = Integer.MIN_VALUE;
        //output->3
        HashMap<Character,Integer>result = new HashMap<>();
        int i=0;
        for(int j = 0;j<s.length();j++){
            char c = s.charAt(j);
            result.put(c,result.getOrDefault(c, 0)+1);
            while (result.size()>k) {
                result.put(s.charAt(i),result.get(s.charAt(i)) - 1);
                if(result.get(s.charAt(i))==0){
                    result.remove(s.charAt(i));

                }
                i++;
            }
                int win = j-i+1;
                maxSum = Integer.max(maxSum,win);
        }
        System.out.println(maxSum);
    }
}