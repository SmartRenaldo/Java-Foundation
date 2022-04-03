package Course7202;

public class LinkedList {
    // Reference to the head of the list
    private Node head;

    // Basic constructor
    public LinkedList() {
        this.head = null;
    }

    // Parametrised constructor
    public LinkedList(Node head) {
        this.head = head;
    }

    // Traverse elements in a list and print them
    public void print() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            Node tmp = this.head; // temporal node that points to current node
            while (tmp != null) {
                // Doing smth with the value
                if (tmp.getNext() != null) {
                    System.out.print("Node " + tmp.getValue() + " -> ");
                } else {
                    System.out.println("Node " + tmp.getValue());
                }

                // Move to the next element
                tmp = tmp.getNext();
            }
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        this.addTail(newNode);
    }

    // Add element to the head
    public void addHead(Node newNode) {
        // Add new node to the beginning
        newNode.setNext(this.head);
        // Move head pointer to the first element
        this.head = newNode;
    }

    // Add element to the tail
    public void addTail(Node newNode) {
        // If list is empty
        if (this.head == null) {
            this.head = newNode;
        } else { // find the end of the list
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext(); // move to the next node
            }
            // Add new node
            tmp.setNext(newNode);
        }
    }

    // Delete element
    public void delete(int value) {
        // If list is empty
        if (this.head == null) {
            // Nothing
            return; // stop method execution
        } else if (this.head.getValue() == value) { // if we need to remove head
            this.head = this.head.getNext();
            return;
        }

        Node tmp = this.head; // pointer to the current element
        Node prev = null; // pointer to the previous node

        // Traverse list until 1) find an element to delete or 2) reach the end
        while (tmp != null && tmp.getValue() != value) { // true && false -> false
            // false && ? -> false
            // false && ? -> false
            // true && true -> true
            prev = tmp;
            tmp = tmp.getNext();
        }

        // We found an element
        if (tmp != null) {
            // Delete it
            prev.setNext(tmp.getNext());
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
