
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HexFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FindDuplicates{
    public static Map<String,List<Path>> getDuplicate(Path root) throws Exception{
        Map<String,List<Path>>map = new HashMap<>();
        try(Stream<Path>files = Files.walk(root)){
            for(Path file: files.filter(Files::isRegularFile).toList()){
                String hexed = getHash(file);
                if(map.containsKey(hexed)){
                    map.get(hexed).add(file);
                }
                else{
                    List<Path>path = new ArrayList<>();
                    path.add(file);
                    map.put(hexed,path);
                }
            }
            Map<String,List<Path>>result = new HashMap<>();

            for(Map.Entry<String,List<Path>>mp:map.entrySet()){
                if(mp.getValue().size()>1){
                    result.put(mp.getKey(),mp.getValue());
                }
            }
            return result;
        }
    }

    public static String getHash(Path file) throws Exception{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte content[] = Files.readAllBytes(file);
        byte hash[] = md.digest(content);
        return HexFormat.of().formatHex(hash);

    }
}