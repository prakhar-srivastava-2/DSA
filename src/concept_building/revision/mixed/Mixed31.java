
import java.util.LinkedHashMap;
import java.util.Map;

public class Mixed31{
    public static int nonRepeat(String s){
        LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        char x= ' ';
        for(Map.Entry<Character,Integer>mp : map.entrySet()){
            if(mp.getValue()==1){
                x = mp.getKey();
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(x==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(nonRepeat(s));
    }
}