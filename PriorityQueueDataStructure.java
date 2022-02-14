import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDataStructure {
    public static void main(String args[]) {
        // Normal Priority Queue
        Queue<Double> queue = new PriorityQueue();
        // Queue from collections interface
        Queue<Double> alteredQueue = new PriorityQueue(Collections.reverseOrder());

        queue.offer(1.2);
        queue.offer(0.5);
        queue.offer(2.7);
        queue.offer(4.5);

        alteredQueue.offer(1.2);
        alteredQueue.offer(0.5);
        alteredQueue.offer(2.7);
        alteredQueue.offer(4.5);

        // Print out all objects in ascending order /w normal pQueue
        int x = 0;
        while (queue.isEmpty() != true) {
            System.out.println("Element " + x + " " + queue.poll());
            x++;
        }

        System.out.println("//");
        System.out.println("//");
        System.out.println("//");

        // Print out all objects in descending order /w altered pQueue
        int y = alteredQueue.size();
        while (alteredQueue.isEmpty() != true) {
            System.out.println("Element " + y + " " + alteredQueue.poll());
            y--;
        }

    }

}
