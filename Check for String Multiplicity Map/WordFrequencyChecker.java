import java.util.HashMap;
import java.util.Map;

public class WordFrequencyChecker {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "a", "c", "b"};
        wordMultiple(letters);
    }

    public static void wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            // If the word is not in the map, add it with value false
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                // If it already exists, set its value to true
                map.put(s, true);
            }
        }
        System.out.println(map);
    }
}
