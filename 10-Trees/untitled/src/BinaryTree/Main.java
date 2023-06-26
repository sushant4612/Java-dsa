package BinaryTree;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    List<Integer> pre = new ArrayList<>();
    List<Integer> post = new ArrayList<>();
    List<Integer> in = new ArrayList<>();
    public static void main(String[] args) {

        BST tree = new BST();
        int[] nums = {6,4,9,10};
        tree.populate(nums);
        tree.display();

    }
    public static void preInPostTraversal(BST tree){
    }
}
