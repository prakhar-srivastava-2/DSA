
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram{
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = true;
        HashMap<Character, Integer> result = new HashMap<>();

        if (s1.length()!= s2.length()){
            isAnagram = false;
            System.out.println(isAnagram);

            return;
        }
        for(int i=0; i<s1.length();i++){
            if(result.containsKey(s1.charAt(i))){
                result.put(s1.charAt(i),result.get(s1.charAt(i))+1);
            }
            else{
                result.put(s1.charAt(i),1);
            }
        }

        for(int i=0; i<s2.length();i++){
            if(result.containsKey(s2.charAt(i))){
                result.put(s2.charAt(i),result.get(s2.charAt(i))-1);
            }
        }
        for(Map.Entry<Character, Integer> entry: result.entrySet()){
            if(entry.getValue()!=0){
                isAnagram = false;
            }
        }
        System.out.println(isAnagram);
    }
}