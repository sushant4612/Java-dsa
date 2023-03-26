package Practice.DoublyLinkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val){
        Node newNode = new Node(val);
        newNode.next = null;
        Node temp = head;
        if(head == null){
            head = newNode;
            newNode.prev = null;
            return;
        }
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insert(int after,int val){
        Node p = find(after);
        Node newNode = new Node(val);
        if(p == null){
            System.out.println("Element doesn't exist");
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if(newNode.next!=null){
            newNode.next.prev = newNode;
        }
    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(value == temp.val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.val + "-> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while (last!=null){
            System.out.print(last.val + "-> ");
            last = last.prev;
        }
        System.out.println("End");
    }

    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}