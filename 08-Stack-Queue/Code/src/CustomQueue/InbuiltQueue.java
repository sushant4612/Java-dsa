package CustomQueue;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(78);
        queue.add(87);
        queue.add(90);
        queue.add(99);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
    }
}
