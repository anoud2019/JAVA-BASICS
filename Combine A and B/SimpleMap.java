import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");

        // Call the function to update the map if both keys exist
        hasFindKey(mapAB);

        System.out.println("Final Map: " + mapAB);
    }

    // Method to check if both "a" and "b" exist and add their concatenated value as "ab"
    public static void hasFindKey(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String result = map.get("a") + map.get("b");
            map.put("ab", result);  // Add concatenated result to the map
        }
    }
}
