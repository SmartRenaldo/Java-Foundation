package Course7202;

public class Node {
    private int value;
    private Node left, right;

    public Node() {
        this.value = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.left = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
