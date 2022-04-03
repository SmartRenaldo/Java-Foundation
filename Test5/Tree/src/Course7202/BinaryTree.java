package Course7202;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    // In-order traverse tree and printing
    public void printInOrder() {
        this.printInOrder(this.root);
        System.out.println();
    }

    // In-order traverse tree and printing
    private void printInOrder(Node root) {
        // Make sure tree/subtree is not empty
        if (root != null) {
            // Print left subtree
            printInOrder(root.getLeft());
            // Print root
            System.out.print(root.getValue() + " ");
            // Print right subtree
            printInOrder(root.getRight());
        }
    }

    // Pre-order traverse tree and printing
    public void printPreOrder() {
        this.printPreOrder(this.root);
        System.out.println();
    }

    // Pre-order traverse tree and printing
    private void printPreOrder(Node root) {
        // Make sure tree/subtree is not empty
        if (root != null) {
            // Print root
            System.out.print(root.getValue() + " ");
            // Print left subtree
            printPreOrder(root.getLeft());
            // Print right subtree
            printPreOrder(root.getRight());
        }
    }

    // Post-order traverse tree and printing
    public void printPostorder() {
        this.printPostorder(this.root);
        System.out.println();
    }

    // Post-order traverse tree and printing
    private void printPostorder(Node root) {
        // Make sure tree/subtree is not empty
        if (root != null) {
            // Print left subtree
            printPostorder(root.getLeft());
            // Print right subtree
            printPostorder(root.getRight());
            // Print root
            System.out.print(root.getValue() + " ");
        }
    }

    public void insert(int value) {
        this.root = this.insertRec(this.root, value);
    }

    // Insert value in BST
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else {
            //going left
            if (value < root.getValue()) {
                root.setLeft(insertRec(root.getLeft(), value));
            } else if (value > root.getValue()) {
                root.setRight(insertRec(root.getRight(), value));
            }
            return root;
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
