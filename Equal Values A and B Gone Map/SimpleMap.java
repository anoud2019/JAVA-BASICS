import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, String> mapAB2 = new HashMap<>();
        mapAB2.put("a", "aaa");
        mapAB2.put("b", "aaa");
        mapAB2.put("c", "cake");
        equalValueMap(mapAB2);
        System.out.println(mapAB2);
    }

    public static void equalValueMap(Map<String, String> map) {
        // Check if both keys "a" and "b" same value
       if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b")))
                // Remove both keys from the map
                map.remove("a");
                map.remove("b");
            }
        }
    }
}
