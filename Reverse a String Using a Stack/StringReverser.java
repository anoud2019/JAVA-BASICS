import java.util.Stack;

public class StringReverser {

    // Method to reverse a string using a stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>(); // Create a stack to hold characters

        // Push each character of the string onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Initialize an empty string to hold the reversed string
        String reversedString = "";

        // Pop each character from the stack to form the reversed string
        while (!stack.isEmpty()) {
            reversedString += stack.pop(); // Append popped character to the reversed string
        }

        return reversedString; // Return the reversed string
    }

    public static void main(String[] args) {
        String input = "hello"; // Example Input
        System.out.println("Before reversing string: " + input);
        String output = reverseString(input); // Reverse the string using the method
        System.out.println("After reversed string: " + output); // Print the reversed string
    }
}
