package LinkedList7202;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.setHead(new Node(5));
        linkedList.print();
        linkedList.setHead(new Node(6));
        linkedList.print();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.setHead(new Node(5, new Node(6)));
        linkedList2.print();

        LinkedList list = new LinkedList();
        /*
        System.out.println(list.getHead().getValue());      //NullPointerException
        System.out.println(list.getHead().getNext());       //NullPointerException
        */
        list.addFirst(null);
        list.addLast(6);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.print();       //3 -> 2 -> 1 -> 6 -> 4 -> 5
        list.delete(5);
        list.print();       //3 -> 2 -> 1 -> 6 -> 4
        list.delete(3);
        list.print();       //2 -> 1 -> 6 -> 4
        list.delete(10);
        list.print();       //2 -> 1 -> 6 -> 4
    }
}
