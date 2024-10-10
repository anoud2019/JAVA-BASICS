import java.util.*;

public class ArrayUnion {

    // Function to find the union of two ArrayLists
    public static ArrayList<Integer> findUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Use a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of the first list to the set
        set.addAll(list1);

        // Add all elements of the second list to the set
        set.addAll(list2);

        // Convert the set back to an ArrayList and return
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        // Create two ArrayLists with some duplicate elements
        ArrayList<Integer> setA = new ArrayList<>();
        setA.add(10);
        setA.add(5);
        setA.add(3);
        setA.add(4);
        setA.add(3);
        setA.add(5);

        // Second list with duplicates
        ArrayList<Integer> setB = new ArrayList<>();
        setB.add(1);
        setB.add(2);
        setB.add(2);
        setB.add(3);

        // Get the union of the two ArrayLists
        ArrayList<Integer> result = findUnion(setA, setB);

        // Print the result
        System.out.println("Union of the two sets: " + result);
    }
}
