import java.util.Scanner;

public class ArrayStack {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(4);
        String key = "";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while (loop) {
            System.out.println("show:显示栈");
            System.out.println("push:入栈");
            System.out.println("pop:出栈");
            System.out.println("exit:退出");
            System.out.println("请输入你的选择");
            key = scanner.next();

            switch (key) {
                case "show": {
                    stack.show();
                    break;
                }
                case "push": {
                    System.out.print("Please enter the number: ");
                    try {
                        int i = scanner.nextInt();
                        stack.push(i);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "pop": {
                    try {
                        stack.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "exit": {
                    scanner.close();
                    loop = false;
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println();
        }
    }
}

class MyArrayStack {
    private int maxSize;//栈的大小
    private int[] stack;//用数组模拟栈
    private int top = -1;//表示栈顶

    public MyArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int number) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = number;
    }

    //出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("没有数据");
            //抛出异常后不需要return
        }
        int value = stack[top];
        top--;
        return value;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("栈空");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = %d\n", i, stack[i]);
        }
    }

    public int getMaxSize() {

        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }
}