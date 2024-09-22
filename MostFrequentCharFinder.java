public class MostFrequentCharFinder {
    public static char mostFrequentChar(String str) {
        int[] charCount = new int[256]; // To store frequency of each character (ASCII)
        int maxCount = 0;
        char mostFrequent = ' ';

        for (char c : str.toCharArray()) {
            charCount[c]++; // Increment the count for the character
            if (charCount[c] > maxCount) {
                maxCount = charCount[c];
                mostFrequent = c;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        String str = "success";
        System.out.println("Most frequent character: " + mostFrequentChar(str));
    }
}
