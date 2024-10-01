public class SubstringCounter {
    public static void main(String[] args) {
        String str = "banana";
        String substring = "ana";
        int count = countOccurrences(str, substring);
        System.out.println("The word: " + substring + " occurs " + count);
        String str2="This sentence is a simple sentence.";
        String substring2="sentence";
        int count2 = countOccurrences(str2, substring2);
        System.out.println("The word: " + substring2 + " occurs " + count2);
    }

    public static int countOccurrences(String str, String substring) {
        int count = 0; // Initialize the count of occurrences
        int index = 0;// Initialize the starting index for search

        // Use indexOf to find occurrences of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;// Increment the count for each found occurrence
            index += substring.length(); // Move index forward to avoid counting the same occurrence
        }

        return count;// Return the total count of occurrences
    }
}
