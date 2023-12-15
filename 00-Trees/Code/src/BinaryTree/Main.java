package BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        int opt;
        while(true){
            System.out.println("Select the option");
            System.out.println("1. Populate the tree");
            System.out.println("2. Display the tree");
            System.out.println("3. Preety Display");
            System.out.println("4 Exit");
            opt = in.nextInt();
            switch (opt){
                case 1:
                    tree.populate(in);
                    break;
                case 2:
                    tree.display();
                    break;
                case 3:
                    tree.preetyDisplay();
                case 4:
                    System.exit(0);
            }
        }
    }
}
