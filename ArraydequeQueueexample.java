package CollectionQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArraydequeQueueexample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

//        System.out.println("Queue using ArrayDeque:");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }
        
        System.out.println(queue.element());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}

