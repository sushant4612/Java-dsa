package BinaryTree;

public class Avl_run {
    public static void main(String[] args) {
        AVL avl = new AVL();

        for (int i = 1; i <= 100 ; i++) {
            avl.insert(i);
        }

        System.out.println();
    }
}
