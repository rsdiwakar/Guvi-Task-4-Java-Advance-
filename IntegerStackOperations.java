import java.util.Stack;
import java.util.Scanner;

public class IntegerStackOperations {

    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStackOperations() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int value) {
        stack.push(value);
        System.out.println("Element " + value + " pushed onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int poppedValue = stack.pop();
            System.out.println("Element " + poppedValue + " popped from the stack.");
        } else {
            System.out.println("Stack is empty. No element to pop.");
        }
    }

    // Method to check if the stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty. It contains " + stack.size() + " element(s).");
        }
    }

    // Method to display the stack content
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current stack elements: " + stack);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStackOperations stackOps = new IntegerStackOperations();
        int choice;

        do {
            // Display menu for stack operations
            System.out.println("\nStack Operations Menu");
            System.out.println("1. Push element onto stack");
            System.out.println("2. Pop element from stack");
            System.out.println("3. Check if stack is empty");
            System.out.println("4. Display current stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Push an element onto the stack
                    System.out.print("Enter an integer to push: ");
                    int value = scanner.nextInt();
                    stackOps.pushElement(value);
                    break;

                case 2:
                    // Pop an element from the stack
                    stackOps.popElement();
                    break;

                case 3:
                    // Check if the stack is empty
                    stackOps.checkIfEmpty();
                    break;

                case 4:
                    // Display current stack elements
                    stackOps.displayStack();
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
