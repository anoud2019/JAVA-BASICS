import java.util.HashMap;
import java.util.Map;

public class MapLengthModifier {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        modifyMap(map);

        System.out.println(map);
    }

    public static void modifyMap(Map<String, String> map) {
        // Check if both keys "a" and "b" exist
        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");

            // Compare lengths and set "c" accordingly
            if (valueA.length() > valueB.length()) {
                map.put("c", valueA);
            } else if (valueA.length() < valueB.length()) {
                map.put("c", valueB);
            } else { // If lengths are equal
                map.put("a", "");
                map.put("b", "");
            }
        }
    }
}
