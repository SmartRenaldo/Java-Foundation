package Calculator02;

public class Test {
    public static void main(String[] args) {
        String expression = "7*2*20-5+1-5+3-40";

        //创建数栈和符号栈
        ArrayStack numStack = new ArrayStack(20);
        ArrayStack operStack = new ArrayStack(20);

        //定义需要的相关变量
        int index = 0;
        char ch = ' ';   //将每次扫描得到 char 保存到 ch
        String keyNum = "";

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
                    //符号栈为空，直接入栈
                    operStack.push(ch);
                }
            } else {
                /**
                 * 当处理多位数时，不能发现是一个数就立即入栈，因为它可能是多位数
                 * 在处理数，需要向 expression的表达式的index后再看一位,如果是数就进行扫描，如果是符号才入栈
                 * 我们需要定义一个变量字符串，用于拼接
                 */
                keyNum += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keyNum));

                } else {
                    if (operStack.isOperator(expression.substring(index + 1, index + 2).charAt(0))) {
                        //判断下一个字符是不是数字，如果是数字，就继续扫描，如果是运算符，则入栈
                        numStack.push(Integer.parseInt(keyNum));
                        keyNum = "";
                    }
                }
            }
            index++;
        }

        //当表达式扫描完毕，就顺序的从数栈和符号栈中pop出相应的数和符号
        while (!operStack.isEmpty()) {
            numStack.push(numStack.calculator(numStack.pop(), numStack.pop(), operStack.pop()));
        }

        //将数栈的最后数pop出，就是结果
        System.out.printf("%s=%d", expression, numStack.pop());
    }
}