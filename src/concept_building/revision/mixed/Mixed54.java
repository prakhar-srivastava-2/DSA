
import java.util.HashSet;
import java.util.Set;

public class Mixed54{
    public static int nonRepeat(String s){
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
            int len = j-i+1;
            maxL = Math.max(maxL,len);
        }
        return maxL;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(nonRepeat(s));
    }
}