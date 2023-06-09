package Practice.LinkedList;

import Practice.LinkedList.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(45);
        list.insertFirst(56);
        list.insertFirst(100);
        list.insertLast(123);
        list.insertLast(150);
        list.insert(23,3);
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
//        list.bubbleSort();
//        list.display();
//        list.reverse();
//        list.display();

//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
    }
}
