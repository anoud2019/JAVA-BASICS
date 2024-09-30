import java.util.HashSet; // Import the HashSet class to store unique characters.

public class RepeatedChar { // Define the class 'firstRepeatedChar'.
    
    public static void main(String[] args) { // Main method where the program starts.
        String input = "Alanoud said AlGhadani"; // Example string input.
        System.out.println(firstRepeaterChar(input)); // Call the method and print the first repeated character.
    }

    public static Character firstRepeaterChar(String input) {
        // Create a HashSet to store unique characters as we iterate through the string.
        HashSet<Character> letters = new HashSet<>();
        
        // Convert the input string into a character array and iterate over it.
        for (char c : input.toCharArray()) {
            // Check if the current character 'c' is already in the HashSet (i.e., it's repeated).
            if (letters.contains(c)) {
                return c; // If repeated, return the character immediately.
            }
            // If the character isn't repeated, add it to the HashSet.
            letters.add(c);
        }
        // If no repeated character is found, return null.
        return null;
    }

}
