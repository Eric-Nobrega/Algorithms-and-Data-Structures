import java.util.Stack;

public class StackDataType {
    public static void main(String[] args) {

        // Initialize Stack

        Stack<Integer> stack = new Stack<Integer>();

        // Returns True
        System.out.println(stack.isEmpty());

        // Push (Add) Elements into the stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        // Returns False
        System.out.println(stack.isEmpty());

        // Pop (Remove) Element from the stack
        stack.pop();

        System.out.println(stack);

        // Capture top element of stack
        int x = stack.pop();

        System.out.println("x is equal to: " + x);

        // The captured object is now missing from stack, as we called the pop method
        System.out.println(stack);

        // Capture the top element, w/o removing it from stack using peek()
        int y = stack.peek();

        System.out.println("y is equal to: " + y);

        System.out.println(stack);

        System.out.println(stack.search(2));

    }
}