package Practice.CircularLinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val){
        if(head == null){
            return;
        }

        Node temp = head;
        if(temp.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            if(temp.val == val){
                temp = temp.next;
                break;
            }
            temp = temp.next;
        }while (temp!=null);
    }

    public void display() {
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.val + "-> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}