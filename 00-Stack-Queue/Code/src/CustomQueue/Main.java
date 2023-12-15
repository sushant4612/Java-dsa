package CustomQueue;

import java.util.Queue;

public class Main{
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(3);
//        queue.add(6);
//        queue.add(9);
//        queue.add(90);
//        queue.display();
//        System.out.println(queue.delete());
//        queue.display();
//        System.out.println(queue.front());

        CircularQueue queue = new DynamicQueue(4);
        queue.insert(7);
        queue.insert(40);
        queue.insert(90);
        queue.insert(98);
//        System.out.println(queue.insert(88));
//        queue.insert(89)
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();
        queue.insert(88);
        queue.insert(98);
        queue.insert(999);
        queue.display();
    }
}
