package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree(){

    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root of the tree");
        root = new  Node(scanner.nextInt());
        populate(scanner,root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert the left of " + node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left of " + node.val);
            node.left = new Node(scanner.nextInt());
            populate(scanner,node.left);
        }
        System.out.println("Do you want to insert the right of " + node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right of " + node.val);
            node.right = new Node(scanner.nextInt());
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(this.root,"");
    }
    public void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void preetyDisplay(){
        preetyDisplay(this.root,0);
    }

    public void preetyDisplay(Node node,int level){
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

    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

}
