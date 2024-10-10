import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChecker {

    // Function to check if the list contains duplicates
    public static boolean containsDuplicate(List<Integer> nums) {
        Set<Integer> set = new HashSet<>(); // Create a HashSet to store unique numbers

        // Iterate through each number in the list
        for (int num : nums) {
            // Check if the set already contains the number
            if (set.contains(num)) {
                return true; // A duplicate has been found
            }
            set.add(num); // Add the number to the set
        }
        return false; // No duplicates found
    }

    // Main method for testing the containsDuplicate function
    public static void main(String[] args) {
        // Create a List of integers using ArrayList
        List<Integer> nums = new ArrayList<>();

        // Add numbers to the list (including duplicates)
        nums.add(1); // Adding the number 1
        nums.add(1); // Adding the number 1 again (duplicate)
        nums.add(3); // Adding the number 3
        nums.add(4); // Adding the number 4
        nums.add(2); // Adding the number 2

        // Output the result of checking for duplicates
        System.out.println(containsDuplicate(nums));  // Output: true
    }
}
