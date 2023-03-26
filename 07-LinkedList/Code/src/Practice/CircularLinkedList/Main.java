package Practice.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(4);
        list.insert(5);
        list.delete(5);
        list.display();
    }
}