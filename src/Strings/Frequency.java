
import java.util.HashMap;

public class Frequency{
    public static void main(String[] args) {

        String word = "Hello";
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<word.length();i++){
            if (freq.containsKey(word.charAt(i))){
                // freq[word[i]]+=1;
                int val = freq.get(word.charAt(i));
                val=val+1;
                freq.put(word.charAt(i), val);

            }
            else{
                freq.put(word.charAt(i), 1);
            }
        }
        System.out.println(freq);
    }
}