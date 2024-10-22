import java.util.HashMap;
import java.util.Map;

public class FoodTopping {
    public static void main(String[] args) {
        Map<String, String> toppingMap = new HashMap<>();
        toppingMap.put("potato", "ketchup");
        toppingMap.put("salad", "oil");
        topping(toppingMap);
        System.out.println(toppingMap);
    }

    public static void topping(Map<String, String> map) {
        // If "potato" is present, set its value for "fries"
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        // If "salad" is present, set its value for "spinach"
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
    }
}
