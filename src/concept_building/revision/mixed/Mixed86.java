
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Mixed86{
    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>>result = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();
        if(strs.length==0){
            return result;
        }
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char sortArray[] = s.toCharArray();
            Arrays.sort(sortArray);
            String s1 = new String(sortArray);
            if(map.containsKey(s1)){
                map.get(s1).add(s);
            }
            else{
                List<String>list = new ArrayList<>();
                list.add(s);
                map.put(s1,list);
            }
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        System.out.println(groupAnagrams(strs));
    }

}