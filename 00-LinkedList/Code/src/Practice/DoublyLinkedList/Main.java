package Practice.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(45);
        list.insertFirst(43);
        list.insertFirst(23);
        list.insertFirst(10);
        list.insertLast(100);
        list.insert(23,67);
        list.display();
    }
}
