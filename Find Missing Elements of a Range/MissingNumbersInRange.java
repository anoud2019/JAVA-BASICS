import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbersInRange {
    public static void main(String[] args) {
        // List of input numbers (present in the array).
        List<Integer> nums = List.of(1, 3, 5, 7);

        // Create a HashSet outside the loop to store elements from nums.
        Set<Integer> set = new HashSet<>(nums);

        // List to store the missing numbers.
        List<Integer> result = new ArrayList<>();

        // Set the range limits.
        Integer lower = 1;
        Integer upper = 10;

        // Iterate through the range [lower, upper].
        for (int i = lower; i <= upper; i++) {
            // Inside the loop, check if the current number i exists in the set.
            if (!set.contains(i)) {
                // If not found, add it to the result list.
                result.add(i);
            }
        }

        // Print the missing numbers.
        System.out.println(result);  // [2, 4, 6, 8, 9, 10]
    }
}
