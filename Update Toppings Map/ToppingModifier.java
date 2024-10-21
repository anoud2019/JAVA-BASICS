import java.util.HashMap;
import java.util.Map;

public class Topping {
    public static void main(String[] args) {

        Map<String, String> toppingMap = new HashMap<>();
        toppingMap.put("ice cream", "peanuts");
        toppingMap.put("pancake", "syrup");

        topping1(toppingMap);

        System.out.println(toppingMap);
    }

    public static void topping1(Map<String, String> map) {
        // If "ice cream" is present, set its value to "cherry"
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        // Always set "bread" to "butter"
        map.put("bread", "butter"); 
    }
}
