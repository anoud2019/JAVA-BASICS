public class LongestWordFinder { // Define the class 'LongestWordFinder'
    public static void main(String[] args) { // Main method where the program starts
        String sentence = "Welcome to java , I am Alanoud"; // Example sentence input
        System.out.println("Longest word: " + longestWord(sentence)); // Call the method and print the longest word
    }

    public static String longestWord(String sentence) { // Method to find the longest word in the sentence
        // Split the sentence into individual words by spaces and store them in an array
        String[] words = sentence.split(" ");
        String longest = ""; // Initialize a variable to store the longest word, starting with an empty string

        // Loop through each word in the array
        for (String word : words) {
            // If the current word is longer than the current 'longest' word
            if (word.length() > longest.length()) {
                longest = word; // Update the 'longest' variable to be the current word
            }
        }

        return longest; // Return the longest word found
    }
}
