
import java.util.HashMap;

public class TestProblem{
    public static void main(String[] args) {
        String s = "ccaabbb";
        int k=2;
        HashMap<Character,Integer>res = new HashMap<>();
        int i=0;
        int maxSum = Integer.MIN_VALUE;
        for(int j= 0;j<s.length();j++){
            char c = s.charAt(j);
            res.put(c,res.getOrDefault(c, 0)+1);
            while(res.size()>k){
                res.put(s.charAt(i), res.get(s.charAt(i))-1);
                if(res.get(s.charAt(i))==0){
                    res.remove(s.charAt(i));
                }
                i++;
            }
            int win = j-i+1;
            maxSum = Integer.max(win,maxSum);
        }
        System.out.println(maxSum);

    }
}