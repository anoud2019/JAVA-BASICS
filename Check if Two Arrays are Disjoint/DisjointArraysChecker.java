import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DisjointArraysChecker {

    // Function to check if two arrays are disjoint
    public static boolean areDisjoint(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        Set<Integer> set = new HashSet<>(arr1); // Convert the first array to a set

        // Check if any element from the second array is present in the set
        for (int num : arr2) {
            if (set.contains(num)) {
                return false; // If any element is found in both arrays, return false
            }
        }
        return true; // If no common elements, return true
    }

    public static void main(String[] args) {
        // Example 1: Disjoint arrays
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);

        // Print arrays and result
        System.out.println("Array 1: " + arr1);
        System.out.println("Array 2: " + arr2);
        boolean result1 = areDisjoint(arr1, arr2);
        System.out.println("Are the arrays disjoint? " + result1); // Output: true

        // Example 2: Arrays with a common element
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);

        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(3);
        arr4.add(4);
        arr4.add(5);

        // Print arrays and result
        System.out.println("\nArray 1: " + arr3);
        System.out.println("Array 2: " + arr4);
        boolean result2 = areDisjoint(arr3, arr4);
        System.out.println("Are the arrays disjoint? " + result2); // Output: false
    }
}
