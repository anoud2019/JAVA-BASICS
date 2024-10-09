import java.util.Stack;

public class DuplicateParenthesesChecker {

    // Method to check for duplicate parentheses
    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>(); // Create a stack to keep track of parentheses

        for (char ch : str.toCharArray()) { // Loop through each character in the string
            if (ch == ')') { // If we encounter a closing parenthesis
                // Check for duplicate parentheses
                if (stack.isEmpty() || stack.peek() == '(') {
                    return true; // Duplicate parentheses found
                }

                // Pop all characters until the matching opening parenthesis is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop(); // Remove the elements inside the parentheses
                }
                // Pop the opening parenthesis from the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // If it's an opening parenthesis or any other character, push it onto the stack
                stack.push(ch);
            }
        }
        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        String input1 = "((a+b)+(c+d))"; // Example Input 1
        String input2 = "((a+b))"; // Example Input 2

        // Check for duplicates in the first input
        System.out.println("Input: " + input1 + " | Has duplicate parentheses? " + hasDuplicateParentheses(input1)); // Expected Output: false

        // Check for duplicates in the second input
        System.out.println("Input: " + input2 + " | Has duplicate parentheses? " + hasDuplicateParentheses(input2)); // Expected Output: true
    }
}
