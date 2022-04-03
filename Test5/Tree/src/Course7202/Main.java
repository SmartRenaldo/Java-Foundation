package Course7202;

public class Main {
    //        6
    //      /   \
    //     3     8
    //    / \   / \
    //   2   4 7   9
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
/*
        tree.setRoot(new Node(6));
        tree.getRoot().setLeft(new Node(3));
        tree.getRoot().setRight(new Node(8));
        tree.getRoot().getLeft().setLeft(new Node(2));
        tree.getRoot().getLeft().setRight(new Node(4));
        tree.getRoot().getRight().setLeft(new Node(7));
        tree.getRoot().getRight().setRight(new Node(9));
*/
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);

        tree.printInOrder();    //2 3 4 6 7 8 9
        tree.printPreOrder();   //6 3 2 4 8 7 9
        tree.printPostorder();  //2 4 3 7 9 8 6
    }
}
