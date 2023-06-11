package CustomQueue;

import java.util.Queue;

public class Main{
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(3);
        queue.add(6);
        queue.add(9);
        queue.add(90);
        queue.display();
        System.out.println(queue.delete());
        queue.display();
        System.out.println(queue.front());
    }
}
