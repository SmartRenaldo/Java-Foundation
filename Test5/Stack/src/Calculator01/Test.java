package Calculator01;

public class Test {
    public static void main(String[] args) {
        String expression = "7*2*2-5+1-5+3-4";

        //创建数栈和符号栈
        ArrayStack numStack = new ArrayStack(20);
        ArrayStack operStack = new ArrayStack(20);

        //定义需要的相关变量
        int index = 0;
        char ch = ' ';   //将每次扫描得到 char 保存到 ch
        int num1 = 0;
        int num2 = 0;
        int oper = 0;

        while (index < expression.length()) {
            //依次得到expression的每一个字符
            ch = expression.substring(index, index + 1).charAt(0);
            //判断ch是什么，然后做相应的处理
            if (operStack.isOperator(ch)) {
                //如果是运算符,判断当前符号栈是否为空
                if (!operStack.isEmpty()) {
                    //符号栈不为空
                    //如果当前运算符的优先级小于或者等于符号栈栈顶的操作符
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        //在从符号栈中pop出一个符号，从数栈中pop出两个数进行运算，将得到结果入数栈
                        numStack.push(numStack.calculator(numStack.pop(), numStack.pop(), operStack.pop()));
                        //将当前的操作符入符号栈
                        operStack.push(ch);
                    } else {
                        //如果当前运算符的优先级大于符号栈栈顶的操作符,直接入栈
                        operStack.push(ch);
                    }
                } else {
                    //符号栈为空，直接入符号栈
                    operStack.push(ch);
                }
            } else {
                //如果ch是数字
                numStack.push(ch - 48);   //1的ASCII码值为49
            }
            index++;
        }

        //当表达式扫描完毕，就顺序的从数栈和符号栈中pop出相应的数和符号
        while (!operStack.isEmpty()) {
            numStack.push(numStack.calculator(numStack.pop(), numStack.pop(), operStack.pop()));
        }

        //将数栈的最后数pop出，就是结果
        System.out.printf("%s=%d\n", expression, numStack.pop());
    }
}