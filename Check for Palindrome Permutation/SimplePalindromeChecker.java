import java.util.HashSet;

public class SimplePalindromeChecker {
    public static void main(String[] args) {
        // Check each string directly
        String input1 = "taco cat";
        System.out.println("Input: s = \"" + input1 + "\"");
        System.out.println("Output: " + isPalindromePossible(input1));
        System.out.println(); // Empty line for better readability

        String input2 = "racecar";
        System.out.println("Input: s = \"" + input2 + "\"");
        System.out.println("Output: " + isPalindromePossible(input2));
        System.out.println();

        String input3 = "hello";
        System.out.println("Input: s = \"" + input3 + "\"");
        System.out.println("Output: " + isPalindromePossible(input3));
        System.out.println();
    }

    public static boolean isPalindromePossible(String input) {
        HashSet<Character> charSet = new HashSet<>(); // Set to track characters

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                // If the character is in the set, remove it; otherwise, add it
                if (charSet.contains(ch)) {
                    charSet.remove(ch); // Remove if it exists (even count)
                } else {
                    charSet.add(ch); // Add if it doesn't exist (odd count)
                }
            }
        }

        // A palindrome can have at most one character with an odd count
        return charSet.size() <= 1;
    }
}
