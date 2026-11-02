
import java.nio.file.*;
import java.security.*;
import java.util.*;
import java.util.stream.*;

public class DuplicateFile {

    public static String getHash(Path file) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] content = Files.readAllBytes(file);
        byte[] hash = md.digest(content);

        return HexFormat.of().formatHex(hash);
    }

    public static Map<String, List<Path>> findDuplicateFiles(Path root)
            throws Exception {

        Map<String, List<Path>> map = new HashMap<>();

        try (Stream<Path> paths = Files.walk(root)) {

            for (Path file : paths.filter(Files::isRegularFile)
                                  .toList()) {

                String hash = getHash(file);

                map.computeIfAbsent(hash, k -> new ArrayList<>())
                   .add(file);
            }
        }

        map.entrySet().removeIf(entry -> entry.getValue().size() == 1);

        return map;
    }

    public static void main(String[] args) throws Exception {

        Path root = Path.of("root");

        Map<String, List<Path>> result = findDuplicateFiles(root);

        result.values().forEach(System.out::println);
    }
}
