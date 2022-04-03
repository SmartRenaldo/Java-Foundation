package LinkedList7202;

public class LinkedList {
    //reference to the head of the list
    private Node head;

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    //traverse elements in a list and print them
    public void print() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            // temporary node that points to current node
            Node tmp = this.head;
            while (tmp != null) {
                if (tmp.getNext() != null) {
                    System.out.print(tmp.getValue() + " -> ");
                    //move to the next element
                } else {
                    System.out.print(tmp.getValue());
                }
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    //add element to the head
    public void addFirst(Node newNode) {
        if (newNode != null) {
            //add new node to the beginning
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            System.out.println("The element should not be null. Failed to add element.");
        }
    }

    public void addFirst(int data) {
        this.addFirst(new Node(data));
    }

    //add element to the tail
    public void addLast(Node newNode) {
        // If list is empty
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            // Add new node
            tmp.setNext(newNode);
        }
    }

    public void addLast(int data) {
        this.addLast(new Node(data));
    }

    public void delete(int data) {
        //handle null first
        if (this.head == null) {
            return;
        }
        //handle deleting the first element
        if (this.head.getValue() == data) {
            this.head = this.head.getNext();
        }

        Node tmp = this.head;   //pointer to the current element
        Node prev = null;   //pointer to the previous Node

        //Traverse list until: 1). find an element to delete; 2). reach the end
        while (tmp != null && tmp.getValue() != data) {
            prev = tmp;
            tmp = tmp.getNext();
        }
        if (tmp != null) {
            //delete it
            prev.setNext(tmp.getNext());
        }
    }
}
