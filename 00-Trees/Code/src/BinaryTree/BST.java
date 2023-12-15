package BinaryTree;

public class BST {

    class Node{
        int val;
        int height;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }


    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
    public void insert(int val){
        root = insert(root,val);
    }

    public Node insert(Node node,int val){
        if(node == null){
            return new Node(val);
        }else if(node.val > val){
            node.left = insert(node.left,val);
        }else{
            node.right = insert(node.right,val);
        }
        node.height = Math.max(height(node.left),height(node.right));
        return node;
    }

    public void populateSorted(int[] arr){
        populateSorted(arr,0,arr.length -1);
    }

    public void populateSorted(int[] arr,int s , int e){
        if(s > e){
            return;
        }
        int mid = s +  (e - s) /2;
        insert(arr[mid]);
        populateSorted(arr,s,mid - 1);
        populateSorted(arr,mid+1,e);
    }
    public void preetyDisplay(){
        preetyDisplay(this.root,0);
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node node){
        if(root == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void preetyDisplay(Node node, int level){
        if(node == null){
            return;
        }
        preetyDisplay(node.right,level + 1);

        if(level != 0){
            for (int i = 0; i < level - 1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        }else{
            System.out.println(node.val);
        }
        preetyDisplay(node.left,level+1);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    public void postOrder(Node node){
        if(node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.val + " ");
    }
}
