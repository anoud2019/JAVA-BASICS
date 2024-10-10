import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

    // Function to check if the array contains duplicates
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(); // Create a HashSet to store unique numbers

        // Iterate through each number in the array
        for (int num : nums) {
            // Check if the set already contains the number
            if (set.contains(num)) {
                return true; // A duplicate has been found
            }
            set.add(num); // Add the number to the set
        }
        return false; // No duplicates found
    }

    // Main method for testing the hasDuplicates function
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}; // Example input
        // Output the result of checking for duplicates
        System.out.println(containsDuplicate(nums));  // Output: true
    }
}
