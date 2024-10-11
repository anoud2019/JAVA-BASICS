import java.util.ArrayList;
import java.util.HashSet;

public class TargetSumChecker {

    // Function to check if there exists a pair that adds up to the target sum
    public static boolean hasPairWithSum(ArrayList<Integer> list, int target) {
        // Create a HashSet to store elements that we've already seen
        HashSet<Integer> set = new HashSet<>();

        // Traverse the ArrayList
        for (int num : list) {
            int complement = target - num; // Find the complement (target - current number)

            // If the complement exists in the set, it means we found a pair
            if (set.contains(complement)) {
                System.out.println("Pair found: " + complement + " + " + num + " = " + target);
                return true; // Return true as soon as we find a valid pair
            }

            // Add the current number to the set
            set.add(num);
        }

        // If no pair is found, return false
        return false;
    }

    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);

        int target = 6; // Target sum

        // Call the function directly
        boolean result = hasPairWithSum(list, target);
        System.out.println("Does the ArrayList have a pair with sum " + target + "? " + result);
    }
}
