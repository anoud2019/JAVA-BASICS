import java.util.HashMap;
import java.util.Map;

public class WordLengthMapper {
    public static void main(String[] args) {
        String[] words = {"code", "and", "bb"};
        findWordLength(words);
    }
    public static void findWordLength(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        // Iterate through each string in the array
        for (String s : strings) {
            map.put(s, s.length()); // Store the string and its length
        }
        System.out.println(map);
    }
}
