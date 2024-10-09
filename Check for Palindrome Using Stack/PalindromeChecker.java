import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "racecar";  // First example input
        boolean result1 = isPalindrome(str1);
        System.out.println("Is the string \"" + str1 + "\" a palindrome? " + result1);

        String str2 = "hello";  // Second example input
        boolean result2 = isPalindrome(str2);
        System.out.println("Is the string \"" + str2 + "\" a palindrome? " + result2);
    }

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();  // Stack to store characters

        // Push all characters of the string into the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Compare each character of the string with the one popped from the stack
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;  // If any character doesn't match, it's not a palindrome
            }
        }

        return true;  // If all characters match, it's a palindrome
    }
}
