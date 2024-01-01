ackage Practice.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void bubbleSort(){
        sort(size-1,0);
    }

    public void sort(int r,int c){
        if(r == 0){
            return;
        }
        if(r>c){
            Node first = get(c);
            Node second = get(c+1);

            if(first.value > second.value){
                if(first == head){
                    first.next = second.next;
                    second.next = first;
                    head = second;
                }else if(tail == second){
                    Node pre = get(c-1);
                    pre.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                }else{
                    Node pre = get(c-1);
                    pre.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            sort(r,c+1);
        }else{
            sort(r-1,0);
        }
    }
    public  void reverse(){
        reverseRec(head);
    }
    
    public void reverseRec(Node node){
        if(node == null){
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
        }
        Node temp = head;
        for (int i = 0; i < index-1 ; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;

        size++;
    }

    public void insertAtIndex(int val, int index){
        head = insertIndex(head,val,index);
    }

    private Node insertIndex(Node current, int val,int index){

        if(index < 0){
            System.out.println("Invalid Index");
            return current;
        }

        if(index == 0){
            Node newNode = new Node(val);
            newNode.next = current;
            return newNode;
        }

        if(current == null){
            System.out.println("Invalid Index");
            return null;
        }

        current.next = insertIndex(current.next,val,index-1);
        return current;
    }

//    public void insertRec(int val, int index){
//        insertRecc(val,index,head);
//    }
//
//    private Node insertRecc(int val,int index ,Node node){
//        if(index == 0){
//            Node temp = new Node(val,node);
//            size++;
//            return temp;
//        }
//        node.next = insertRecc(val, index-1, node.next);
//        return node;
//    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node temp = get(size-2);
//        while(temp.next.next!=null) {
//            temp = temp.next;
//        }
        int val = tail.value;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 1){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node temp = get(index-1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node find(int value){
        Node temp = head;
        while (temp!=null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

//    public void reverse(Node node){
//        if(node == tail){
//            head = tail;
//            return;
//        }
//        reverse(node.next);
//        tail.next = node;
//        tail = node;
//        node.next = null;
//    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
