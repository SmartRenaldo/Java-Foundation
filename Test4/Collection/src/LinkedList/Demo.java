package LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("11");
        linkedList.addFirst("22");
        linkedList.addLast("33");
        linkedList.addLast("44");
        System.out.println("linkedList = " + linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.size());
        linkedList.add(4, "55");
        linkedList.add("66");
        System.out.println("linkedList = " + linkedList);
        linkedList.removeFirst();
        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());
        System.out.println("linkedList = " + linkedList);
        linkedList.remove(3);
        System.out.println("linkedList = " + linkedList);

        LinkedList<String> stack = new LinkedList<>();
        //join the stack
/*
        source code of push():
        public void push(E e) {
            addFirst(e);
        }
        */
        stack.push("Bullet 1");
        stack.push("Bullet 2");
        stack.push("Bullet 3");
        stack.push("Bullet 4");
        System.out.println(stack);
        //out of the stack
        stack.pop();
/*
        source code of pop()
        public E pop() {
            return removeFirst();
        }
        */
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
