
import java.util.LinkedHashMap;
import java.util.Map;

public class F1{
    public static char firstNonRepeat(String s){
        if(s.length()==1){
            return s.charAt(0);
        }
        Map<Character,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer>mp:map.entrySet()){
            if(mp.getValue()==1){
                return mp.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(firstNonRepeat(s));
    }
}



