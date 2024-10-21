import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, String> mapAB3 = new HashMap<>();
        mapAB3.put("b", "bbb");
        mapAB3.put("c", "cake");

        oneValueGet(mapAB3);

        System.out.println(mapAB3);
    }

    public static void oneValueGet(Map<String, String> map) {
        // Check if "b" exists and "a" does not
        if (map.containsKey("b") && !map.containsKey("a")) {
            // Set "a" to have the same value as "b"
            map.put("a", map.get("b"));
        }
        // Check if "a" exists and "b" does not
        else if (map.containsKey("a") && !map.containsKey("b")) {
            // Set "b" to have the same value as "a"
            map.put("b", map.get("a"));
        }

    }
}
