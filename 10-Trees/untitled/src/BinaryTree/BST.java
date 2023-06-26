package BinaryTree;

public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root,value);
    }

    private Node insert(Node node,int value){
        if(node == null){
            return new Node(value);
        }else if (node.value < value){
            node.right = insert(node.right,value);
        }else{
            node.left = insert(node.left,value);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }

    public boolean isBalanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        display(root,"Root Node :");
    }

    private void display(Node node,String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left,"Left child of " + node.value + ":");
        display(node.right,"Roght child of " + node.value + ":");
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    //time complexity - n(log(n))
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums,int start,int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start)/2;
        populateSorted(nums,0,mid);
        populateSorted(nums,mid+1,end);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

}
