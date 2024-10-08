import java.util.Stack;

public class SimpleStackMax {

    // A stack to store the numbers
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        // Pushing numbers into the stack
        push(3);  // Push 3 into the stack
        push(6);  // Push 6 into the stack
        push(4);  // Push 4 into the stack

        // Finding the maximum number in the stack
        findMax(); // Output the maximum element in the stack
    }

    // Method to push elements into the stack
    public static void push(int element) {
        stack.push(element); // Add the element to the top of the stack
    }

    // Method to find the maximum element in the stack
    public static void findMax() {
        // Assume the first element is the maximum, use peek to get the top element without removing it
        int max = stack.peek();

        // Loop through each element in the stack
        for (int num : stack) {
            // If the current number is greater than the current max, update max
            if (num > max) {
                max = num; // Update max with the larger number
            }
        }

        // Print the maximum element found
        System.out.println("The maximum element is: " + max);
    }
}
