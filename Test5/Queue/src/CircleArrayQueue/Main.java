package CircleArrayQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(4); //说明设置 4, 其队列的有效数据最大是 3
        Scanner sc = new Scanner(System.in);
        char key = ' ';
        boolean loop = true;

        while (loop) {
            System.out.println("e:enqueue");
            System.out.println("d:dequeue");
            System.out.println("p:peekFront");
            System.out.println("s:show");
            System.out.println("0:exit");
            System.out.print("Please enter your choice: ");

            key = sc.next().charAt(0);
            switch (key) {
                case 'e':
                    System.out.print("Please enter a number: ");
                    try {
                        int num = sc.nextInt();
                        queue.enqueue(num);
                        System.out.println("Add successfully!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'd':
                    try {
                        int num = queue.dequeue();
                        System.out.println("The data extracted is " + num);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'p':
                    try {
                        int num = queue.peekFront();
                        System.out.println("The front number is " + num);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 's':
                    queue.show();
                    break;
                case '0':
                    sc.close();
                    loop = false;
                    System.out.println("Program exit!");
            }
        }
    }
}
