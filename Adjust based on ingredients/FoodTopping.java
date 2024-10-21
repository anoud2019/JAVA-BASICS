import java.util.HashMap;
import java.util.Map;

public class FoodTopping {
    public static void main(String[] args) {

        Map<String, String> food = new HashMap<>();
        food.put("ice cream", "cherry");
        food.put("spinach", "dirt");

        toppingFood(food);

        System.out.println(food); // Should display {ice cream=cherry, spinach=nuts, yogurt=salt}

        // Create another map for testing purposes
        Map<String, String> foodTest = new HashMap<>();
        foodTest.put("ice cream", "cherry"); // Add ice cream with cherry topping
        toppingFood(foodTest);
        System.out.println(foodTest); // Should display {ice cream=cherry, yogurt=salt}
    }

    public static void toppingFood(Map<String, String> map) {
        // Check if the map contains the key "ice cream"
        if (map.containsKey("ice cream")) {
            // If it does, add the key "yogurt" with a value of "salt"
            map.put("yogurt", "salt");
        }

        // Check if the map contains the key "spinach"
        if (map.containsKey("spinach")) {
            // If it does, change its value to "nuts"
            map.put("spinach", "nuts");
        }
    }
}
