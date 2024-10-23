import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "a", "c", "b","d"};
        countWords(letters);
    }
    public static void countWords(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                // If the word exists, increment its count
                int count = map.get(s);
                map.put(s, count + 1);
            } else {
                // If the word doesn't exist, add it with count 1
                map.put(s, 1);
            }
        }

        System.out.println(map);
    }
}
