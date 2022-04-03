package Calculator02;

//多位数的加减乘除
public class ArrayStack {
    private int maxSize;//栈的大小
    private int[] stack;//用数组模拟栈
    private int top = -1;//表示栈顶

    public ArrayStack() {
    }

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[this.maxSize];
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

    /**
     * 返回运算符的优先级，用数字表示，数字越大优先级越高
     *
     * @param oper
     * @return
     */
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        }
        return -1;
    }

    /**
     * 判断是不是一个运算符
     *
     * @param value
     * @return
     */
    public boolean isOperator(char value) {
        return value == '+' || value == '-' || value == '*' || value == '/';
    }

    public int calculator(int num1, int num2, int oper) {
        return switch (oper) {
            case '+' -> num2 + num1;
            case '-' -> num2 - num1;
            case '*' -> num2 * num1;
            case '/' -> num2 / num1;
            default -> 0;
        };
    }

    public int peek(){
        return stack[top];
    }
}