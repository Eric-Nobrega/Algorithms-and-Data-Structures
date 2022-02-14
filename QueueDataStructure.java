import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {
    public static void main(String[] args) {

        // Initialise the queue, as a linked list, since a queue is an interface
        Queue<String> queue = new LinkedList<String>();

        // Add objects using .offer()
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        // Print head of queue
        System.out.println(queue.peek());

        // Remove head
        queue.poll();

        System.out.println(queue);

        // Check if empty
        System.out.println(queue.isEmpty());

    }
}