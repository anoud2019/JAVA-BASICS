import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquePairsWithTargetSum {

    public static void main(String[] args) {

        Integer target = 6; // Target sum

        // List of input numbers
        List<Integer> numbers = List.of(1, 5, 7, -1, 5);

        // Set to store unique pairs
        Set<List<Integer>> uniquePairs = new HashSet<>();

        // Set to track the numbers we have seen so far
        Set<Integer> seen = new HashSet<>();

        // Loop over each number in the list
        for (Integer num : numbers) {
            int complement = target - num; // Calculate the complement

            // If the complement is in the 'seen' set, add the pair
            if (seen.contains(complement)) {
                List<Integer> pair = List.of(complement, num);
                uniquePairs.add(pair); // Add the pair to the set
            }

            // Add the current number to the 'seen' set
            seen.add(num);
        }

        // Print the unique pairs
        System.out.println("Output: " + uniquePairs);
    }
}
