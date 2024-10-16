import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctElementsInWindow {
    public static void main(String[] args) {
        // Initialize a list of integers (the input array).
        List<Integer> nums = List.of(1, 2, 1, 3, 4, 2, 3);

        // Create a result list to store the count of distinct elements for each window.
        List<Integer> result = new ArrayList<>();

        // Set the size of the sliding window.
        Integer k = 4;

        // Loop through the array to slide the window from left to right.
        // The loop runs until the last valid window position (nums.size() - k).
        for (int i = 0; i <= nums.size() - k; i++) {

            // Use a HashSet to store unique elements from the current window.
            Set<Integer> uniqueNumbers = new HashSet<>();

            // Loop through the current window of size k.
            for (int j = i; j < i + k; j++) {
                // Add each element in the window to the HashSet (duplicates are ignored).
                uniqueNumbers.add(nums.get(j));
            }

            // Add the size of the HashSet (count of distinct elements) to the result list.
            result.add(uniqueNumbers.size());
        }

        // Print the result list containing the count of distinct elements for each window.
        System.out.println(result);
    }
}
