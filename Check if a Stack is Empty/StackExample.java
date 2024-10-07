public class StackExample {
    private int[] stack;       // Array to store stack elements
    private int top;           // Pointer to the top element of the stack
    private int capacity;      // Maximum capacity of the stack

    // Constructor to initialize the stack
    public StackExample(int size) {
        stack = new int[size]; // Create an array of specified size
        capacity = size;       // Set the maximum capacity
        top = -1;              // Initialize top to -1, meaning the stack is empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top + 1 < capacity) { // Check if there is space in the stack
            stack[++top] = value;  // Increment top and add the value to the stack
            System.out.println(value + " pushed into stack");
        } else {
            System.out.println("Stack overflow: Unable to push " + value); // Message if the stack is full
        }
    }

    // Method to remove and return the top element of the stack
    public int pop() {
        if (!isEmpty()) {         // Check if the stack is not empty
            System.out.println(stack[top] + " popped from stack");
            return stack[top--];  // Return the top element and decrement the top
        } else {
            System.out.println("Stack underflow: Unable to pop"); // Message if the stack is empty
            return -1; // Return -1 to indicate the stack is empty
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Return true if top equals -1, meaning the stack is empty
    }

    // Main method for testing
    public static void main(String[] args) {
        StackExample stack = new StackExample(3); // Create a stack with capacity of 3

        stack.push(1);  // Add 1 to the stack
        stack.push(2);  // Add 2 to the stack
        stack.pop();    // Remove the top element (2)
        System.out.println("Is stack empty? " + stack.isEmpty());  // Check if the stack is empty
        stack.pop();    // Remove the remaining element (1)
        System.out.println("Is stack empty? " + stack.isEmpty());  // Check if the stack is empty
    }
}
