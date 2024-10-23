import java.util.HashMap;
import java.util.Map;

public class WordAppender {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "a", "s", "a", "a", "a", "a"};
        appendWords(letters);
    }

    public static void appendWords(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (String s : strings) {
            // If the string is already in the map, increment the count
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                // If it's a new string, add it to the map with an initial count of 1
                map.put(s, 1);
            }

            // If the count of the string is even, append it to the result string
            if (map.get(s) % 2 == 0) {
                result += s;
            }
        }
        System.out.println(result);
    }
}
