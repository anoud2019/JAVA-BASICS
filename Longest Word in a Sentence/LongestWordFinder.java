public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "Welcome to java , I am Alanoud";
        System.out.println("Longest word: " + longestWord(sentence));
    }
    public static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

}
