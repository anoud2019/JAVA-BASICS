import java.util.HashMap;
import java.util.Map;

public class StringAggregator {
    public static void main(String[] args) {
        String[] words = {"salt", "tea", "soda", "toast"};
        generateFirstChar(words);
    }

    public static void generateFirstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            String firstChar = s.charAt(0) + ""; // Get the first character as a string

            // Check if the map already contains this first character
            if (map.containsKey(firstChar)) {
                map.put(firstChar, map.get(firstChar) + s); // Concatenate the string
            } else {
                map.put(firstChar, s); // Initialize with the current string
            }
        }

        System.out.println(map);
    }
}
