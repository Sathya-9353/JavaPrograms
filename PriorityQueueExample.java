package CollectionQueue;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(3);
        queue.add(7);

        System.out.println("Queue using PriorityQueue (priority order):");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
        
        System.out.println(queue.element());
        System.out.println(!queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}

