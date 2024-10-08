public class SimpleStack {
    private static int[] stack = new int[5]; // Array to hold stack elements
    private static int top = -1;              // Index of the top element in the stack

    // Method to add an element to the stack
    public static void push(int value) {
        if (top + 1 < stack.length) { // Check if there is space in the stack
            stack[++top] = value;      // Increment top and add the value to the stack
        } else {
            System.out.println("Stack overflow: Unable to push " + value);
        }
    }

    // Method to remove and return the top element of the stack
    public static int pop() {
        if (!isEmpty()) {               // Check if the stack is not empty
            return stack[top--];        // Return the top element and decrement the top index
        } else {
            System.out.println("Stack underflow: Unable to pop");
            return -1; // Return -1 to indicate the stack is empty
        }
    }

    // Method to return the top element of the stack without removing it
    public static int peek() {
        if (!isEmpty()) {               // Check if the stack is not empty
            return stack[top];          // Return the top element
        } else {
            System.out.println("Stack is empty: Unable to peek");
            return -1; // Return -1 to indicate the stack is empty
        }
    }

    // Method to check if the stack is empty
    public static boolean isEmpty() {
        return top == -1; // Return true if top index is -1, meaning the stack is empty
    }

    // Main method for testing the stack
    public static void main(String[] args) {
        push(10); // Push 10 onto the stack
        push(20); // Push 20 onto the stack
        push(30); // Push 30 onto the stack

        System.out.println(pop()); // Pop and print the top element (30)
        System.out.println(peek()); // Peek and print the new top element (20)
    }
}
