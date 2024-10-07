public class SimpleStack {
    private int[] stack;       // Array to hold stack elements
    private int top;           // Index of the top element in the stack
    private int capacity;      // Maximum size of the stack

    // Constructor to initialize the stack
    public SimpleStack(int size) {
        stack = new int[size]; // Create stack with the specified size
        capacity = size;       // Set the maximum size
        top = -1;             // Initialize top index to -1 (indicating stack is empty)
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top + 1 < capacity) { // Check if there is space in the stack
            stack[++top] = value;  // Increment top and add the value to the stack
        } else {
            System.out.println("Stack overflow: Unable to push " + value);
        }
    }

    // Method to remove and return the top element of the stack
    public int pop() {
        if (!isEmpty()) {         // Check if the stack is not empty
            return stack[top--];  // Return the top element and decrement the top index
        } else {
            System.out.println("Stack underflow: Unable to pop");
            return -1; // Return -1 to indicate the stack is empty
        }
    }

    // Method to return the top element of the stack without removing it
    public int peek() {
        if (!isEmpty()) {         // Check if the stack is not empty
            return stack[top];    // Return the top element
        } else {
            System.out.println("Stack is empty: Unable to peek");
            return -1; // Return -1 to indicate the stack is empty
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Return true if top index is -1, meaning the stack is empty
    }

    // Main method for testing the stack
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5); // Create a stack with a capacity of 5

        stack.push(10); // Push 10 onto the stack
        stack.push(20); // Push 20 onto the stack
        stack.push(30); // Push 30 onto the stack

        System.out.println(stack.pop()); // Pop and print the top element (30)
        System.out.println(stack.peek()); // Peek and print the new top element (20)
    }
}
