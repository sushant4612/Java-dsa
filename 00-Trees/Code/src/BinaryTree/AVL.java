package BinaryTree;

public class AVL {

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

    public AVL(){

    }

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
    public void insert(int val){
        root = insert(root,val);
    }

    public Node insert(Node node, int val){
        if(node == null){
            return new Node(val);
        }else if(node.val > val){
            node.left = insert(node.left,val);
        }else{
            node.right = insert(node.right,val);
        }
        node.height = 1 + Math.max(height(node.left),height(node.right));
        return rotate(node);
    }

    public Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left left case
                return rightRotate(node);
            }
               // left right case
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                //right right case
                return leftRotate(node);
            }
                // right left case
            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }

    public Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;
        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }


    public boolean isBalanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node node){
        if(root == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void preetyDisplay(){
        preetyDisplay(this.root,0);
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
}
