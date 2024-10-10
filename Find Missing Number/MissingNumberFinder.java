import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberFinder {

    // Function to find the missing number using Set and ArrayList
    public static int findMissingNumber(ArrayList<Integer> arrList) {
        Set<Integer> numSet = new HashSet<>(arrList); // Convert ArrayList to Set for fast lookup
        int n = arrList.size(); // Get the size of the list (n)

        // Check for missing number from 0 to n
        for (int i = 0; i <= n; i++) {
            if (!numSet.contains(i)) {
                return i; // If the set doesn't contain this number, it's the missing one
            }
        }

        return -1; // This line will never be reached, since one number is always missing
    }

    public static void main(String[] args) {
        // Create an ArrayList with some distinct numbers but missing one
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(4);
        arrList.add(2);
        arrList.add(1);
        arrList.add(0);

        System.out.println("Missing number: " + findMissingNumber(arrList)); // Output: 3
    }
}
