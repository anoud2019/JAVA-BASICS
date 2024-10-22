import java.util.HashMap;
import java.util.Map;

public class StringCounter {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c"};
        wordCount(letters);
    }
    public static void wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        // Iterate through each string in the array
        for (String s : strings) {
            map.put(s, 0); // Add string to the map with value 0
        }

        System.out.println(map);
    }
}
