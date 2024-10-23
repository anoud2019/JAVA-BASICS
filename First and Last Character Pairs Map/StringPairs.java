import java.util.HashMap;
import java.util.Map;

public class StringPairs {
    public static void main(String[] args) {
        String[] words = {"man", "moon", "good", "right"};
        findFirstLastChar(words);
    }

    public static void findFirstLastChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            // Directly put the first and last character in the map
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }
        System.out.println(map);
    }
}
