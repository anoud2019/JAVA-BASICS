import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine(); // Read the input string from the user

        // Find and print the most frequent character in the entered string
        System.out.println("Most frequent character: " + findMostFrequentChar(str));
        scanner.close(); // Close the scanner to prevent resource leaks
    }

    public static Character findMostFrequentChar(String str) {
        HashMap<Character, Integer> frequentChar = new HashMap<>(); // HashMap to store character frequencies

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) { // Convert the string to a character array and iterate through it
            // Increment the count for character 'c' in the map; if 'c' doesn't exist, start with 0
            frequentChar.put(c, frequentChar.getOrDefault(c, 0) + 1);
        }

        // Variables to track the most frequent character and its count
        char mostFrequent = str.charAt(0); // Initialize with the first character of the string
        int maxCount = 0; // Initialize the maximum count to zero

        // Loop through the HashMap to find the most frequent character
        for (HashMap.Entry<Character, Integer> entry : frequentChar.entrySet()) {
            char character = entry.getKey(); // Get the character from the current entry in the HashMap
            int count = entry.getValue(); // Get the frequency count of that character from the current entry

            // Update if we find a character with a higher frequency
            if (count > maxCount) {
                mostFrequent = character; // Update the most frequent character
                maxCount = count; // Update the maximum count
            }
        }

        // Return the most frequent character
        return mostFrequent;
    }
}
