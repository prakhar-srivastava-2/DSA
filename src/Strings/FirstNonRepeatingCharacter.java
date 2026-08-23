
import java.util.LinkedHashMap;
import java.util.Map;

class FirstNonRepeatingCharacter{

    public static void main(String[] args) {
        String word = "swiss";
        LinkedHashMap<Character, Integer> data = new LinkedHashMap<>();
        for(int i=0; i<word.length(); i++){
            if(data.containsKey(word.charAt(i))){
                data.put(word.charAt(i), data.get(word.charAt(i))+1);
            }
            else{
                data.put(word.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:data.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
        }
    }
