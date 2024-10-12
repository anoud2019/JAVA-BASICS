import java.util.HashSet;
import java.util.Set;

class CommonCharactersFinder {

    // Function to return common characters between two strings
    public static Set<Character> findCommonCharacters(String str1, String str2) {
        // Create a Set to store characters of the first string
        Set<Character> set = new HashSet<>();

        // Add all characters of the first string to the set
        for (char c : str1.toCharArray()) {
            set.add(c);
        }

        // Create a Set to store the common characters
        Set<Character> commonSet = new HashSet<>();

        // Check each character in the second string
        for (char c : str2.toCharArray()) {
            if (set.contains(c)) {
                commonSet.add(c);  // Add the common character
            }
        }

        return commonSet; // Return the set of common characters
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        // Get the common characters between two string
        // Print the result
        System.out.println("Common characters: " + findCommonCharacters(str1, str2));
    }
}
