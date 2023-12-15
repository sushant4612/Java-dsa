package BinaryTree;

public class Bst_run {
    public static void main(String[] args) {
        BST bst = new BST();
//        bst.insert(9);
//        bst.insert(10);
//        bst.insert(4);
//        bst.insert(11);
        bst.populateSorted(new int[]{2,4,5,6,7,8,9,10});
        bst.preetyDisplay();
    }
}
