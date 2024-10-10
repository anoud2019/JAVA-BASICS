import java.util.*;

class UniqueElementFinder {
    // This function prints all distinct elements from the given ArrayList
    public static void findUniqueElements(ArrayList<Integer> arrList) {
        // Creates an empty HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input ArrayList
        for (int num : arrList) {
            // If the element is not already in the HashSet, add it to the set and print it
            if (!set.contains(num)) {
                set.add(num); // Add the element to the HashSet
                System.out.print(num + " "); // Print the distinct element
            }
        }
    }

    // Main method to test the above method
    public static void main(String[] args) {
        // Create an ArrayList of integers with some duplicate elements
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(5);
        arrList.add(3);
        arrList.add(4);
        arrList.add(3);
        arrList.add(5);
        arrList.add(6);

        // Call the method to print unique elements of the ArrayList
        findUniqueElements(arrList);
    }
}
