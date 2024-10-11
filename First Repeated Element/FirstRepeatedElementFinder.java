import java.util.ArrayList;
import java.util.HashSet;

public class FirstRepeatedElementFinder {

    // Function to find the first repeated element in the list
    public static int findFirstRepeated(ArrayList<Integer> list) {
        // Create a HashSet to store the elements we've encountered
        HashSet<Integer> set = new HashSet<>();

        // Traverse all elements in the list
        for (int num : list) {
            // If the element is already in the set, it's a repeated element
            if (set.contains(num)) {
                return num; // Return the first repeated element
            }
            // Add the element to the set
            set.add(num);
        }

        // If no repeated element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Create an ArrayList and add some numbers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);

        // Call the function to find the first repeated element
        int result = findFirstRepeated(list);

        // Print the result
        if (result != -1) {
            System.out.println("The first repeated element is: " + result);
        } else {
            System.out.println("No repeated elements found.");
        }
    }
}
