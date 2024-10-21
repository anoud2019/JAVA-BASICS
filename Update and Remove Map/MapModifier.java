import java.util.HashMap;
import java.util.Map;

public class MapModifier {
    public static void main(String[] args) {

        Map<String, String> mapShare = new HashMap<>();
        mapShare.put("a", "aaa");
        mapShare.put("b", "bbb");
        mapShare.put("c", "ccc");
        mapShare.put("d","hi");

        // Update and remove keys in the map
        updateAndRemoveMap(mapShare);

        // Print the modified map
        System.out.println(mapShare);
    }

    public static void updateAndRemoveMap(Map<String, String> map) {
        // Check if key "a" exists in the map
        if (map.containsKey("a")) {
            // Get the value of "a"
            String valueA = map.get("a");
            // Update key "b" with the value of key "a"
            map.put("b", valueA);
        }
        // remove the key "c", leaving the rest of the map unchanged
        map.remove("c");
    }
}
