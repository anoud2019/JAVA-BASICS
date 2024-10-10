import java.util.ArrayList;
import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        // Create two lists and add numbers to them
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Call the method to find the intersection
        ArrayList<Integer> intersection = findIntersection(list1, list2);

        // Print the intersecting elements
        System.out.println("Intersection: " + intersection);
    }

    public static ArrayList<Integer> findIntersection(ArrayList<Integer> set1, ArrayList<Integer> set2) {
        ArrayList<Integer> intersection = new ArrayList<>(); // List to store intersecting elements

        // Check each element in the first list
        for (int num : set1) {
            // If the element is also in the second list, add it to the intersection
            if (set2.contains(num)) {
                intersection.add(num); // Add the element to the intersection list
            }
        }

        return intersection; // Return the intersecting elements
    }
}