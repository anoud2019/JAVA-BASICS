import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        // Create the array and read elements from the user
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the value of k
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        // Call the method and print the result directly
        System.out.println("Result: " + containsNearbyDuplicate(arr, k));

        sc.close();
    }

    // Make the method static so it can be called from the static main method
    public static boolean containsNearbyDuplicate(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is in the set
            if (set.contains(arr[i])) {
                return true; // Duplicate found
            }
            set.add(arr[i]);

            // Maintain the size of the set to be at most k
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }
        return false; // No duplicate found within the range
    }
}
