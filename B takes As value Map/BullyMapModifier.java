import java.util.HashMap;
import java.util.Map;

public class BullyMapModifier {
    public static void main(String[] args) {

        Map<String, String> mapBully = new HashMap<>();
        mapBully.put("a", "candy");
        mapBully.put("b", "carrot");
        mapBully.put("c", "meh");

        applyMapBully(mapBully);


        System.out.println(mapBully);
    }


    public static void applyMapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            // Set the value of "b" to the value of "a"
            map.put("b", map.get("a"));
        }
        // Set the value of "a" to an empty string
        map.put("a", " ");
    }
}
