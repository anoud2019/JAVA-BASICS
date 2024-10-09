import java.util.Stack;

public class StackChecker {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Creating a new stack of integers

        // Push the element 1 onto the stack
        stack.push(1);

        // Remove (pop) the top element from the stack
        stack.pop();

        // Check if the stack is empty after the pop operation and print a clear message
        if (stack.isEmpty()) {
            System.out.println("Stack is empty: true"); // If the stack is empty after pop, print "true" with a descriptive message
        } else {
            System.out.println("Stack is not empty: false"); // If the stack is not empty, print "false" with a descriptive message
        }
    }
}
