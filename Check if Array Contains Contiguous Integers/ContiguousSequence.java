import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContiguousSequence {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 2, 3, 6, 4, 4, 7);
        List<Integer> list2 = List.of(10, 14, 10, 12);

        // Print the results for both lists
        System.out.println(isContiguous(list1));
        System.out.println(isContiguous(list2));
    }

    /**
     * This method checks if the given list contains a contiguous sequence of integers.
     * A contiguous sequence means all integers between the smallest and largest value must be present.
     *
     * @param list The input list of integers.
     * @return true if the list is contiguous, false otherwise.
     */
    public static boolean isContiguous(List<Integer> list) {
        // Use a HashSet to remove duplicates and store unique elements
        Set<Integer> set = new HashSet<>(list);

        // Find the minimum and maximum values in the set
        int min = Collections.min(set);
        int max = Collections.max(set);

        // Loop through all numbers between min and max (inclusive)
        for (int i = min; i <= max; i++) {
            // If any number in the range is missing, return false
            if (!set.contains(i)) {
                return false;
            }
        }
        // If all numbers are present, return true
        return true;
    }
}
