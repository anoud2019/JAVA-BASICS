import java.util.HashSet;

public class LongestKUniqueCharacters {

    // Function to find the length of the longest substring with exactly k unique characters
    static int longestKSubstr(String s, int k) {
        int n = s.length(); // Get the length of the input string
        int maxLength = -1; // To store the maximum length found

        // Loop over all possible starting points of substrings
        for (int start = 0; start < n; start++) {
            // Loop over all possible ending points for substrings
            for (int end = start + 1; end <= n; end++) {
                HashSet<Character> uniqueChars = new HashSet<>(); // Track unique characters in the substring

                // Add each character in the substring to the set
                for (int x = start; x < end; x++) {
                    uniqueChars.add(s.charAt(x));
                }

                // Check if the number of unique characters equals k
                if (uniqueChars.size() == k) {
                    maxLength = Math.max(maxLength, end - start); // Update the maxLength if needed
                }
            }
        }

        // Return the result
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe"; // Example input string
        int k = 3; // Required number of unique characters

        // Call the function and print the result
        System.out.println("Output: " + longestKSubstr(s, k));
    }
}
