import java.util.*;

public class SumTriplets {
    public static void main(String[] args) {
        // Initialize the list with integers using List.of()
        List<Integer> arr = List.of(0, -1, 2, -3, 1);
        Set<String> uniqueTriplets = new HashSet<>(); // Set to store unique triplet strings

        // Loop through all possible triplets using three nested loops.
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = i + 1; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    // Check if the sum of the triplet is zero.
                    if (arr.get(i) + arr.get(j) + arr.get(k) == 0) {
                        // Create a unique key for the triplet.
                        // Sort the triplet to ensure unique combinations.
                        List<Integer> triplet = Arrays.asList(arr.get(i), arr.get(j), arr.get(k));
                        Collections.sort(triplet); // Sort to ensure unique combinations
                        String tripletKey = triplet.toString(); // Convert to string

                        // Add the triplet to the set if it's not already present.
                        uniqueTriplets.add(tripletKey);
                    }
                }
            }
        }

        // Print the unique triplets.
        System.out.println(uniqueTriplets);
    }
}
